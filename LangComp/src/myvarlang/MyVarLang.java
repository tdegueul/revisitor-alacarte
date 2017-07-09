package myvarlang;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import boolexp.BoolExpressions.And;
import boolexp.BoolExpressions.BoolExp;
import boolexp.BoolExpressions.BoolLit;
import boolexp.BoolExpressions.Fals;
import boolexp.BoolExpressions.Or;
import boolexp.BoolExpressions.Tru;
import imp.Imp.Block;
import imp.Imp.Condition;
import imp.Imp.Print;
import imp.Imp.Stmt;
import imp.Imp.While;
import mylang.MyLang.BoolExpAdapter;
import mylang.MyLang.EvalMyLang;
import mylang.MyLang.MyPrint;
import mylang.MyLang.PrintMyLang;
import sleepstmt.SleepStmt.Sleep;

// MyVarLang extends MyLang with the possibility
// to declare Boolean variables that can be referred
// within Boolean expressions
public class MyVarLang {
	// MyVarLang "metamodel"
	public static class VarDecl extends Stmt {
		String name;
		BoolExp value;
		public VarDecl(String n, BoolExp v) { name = n; value = v; }
	}
	public static class VarRef extends BoolLit {
		String name;
		public VarRef(String n) { name = n; }
	}

	// MyVarLang Revisitor
	interface MyVarLangAlg<S, B extends S, W extends S, P extends S, C, E, SL extends S, VD extends S, VR extends E> {
		//extends MyLangAlg<S, B, W, P, C, E, SL> {
		VD varDecl(VarDecl it);
		VR varRef(VarRef it);
		
		default VD $(VarDecl it) { return varDecl(it); }
		default VR $(VarRef it)  { return varRef(it); }
		default S $(Stmt it)     { return varDecl((VarDecl) it); }
		default E $(BoolExp it)  { return varRef((VarRef) it); }
		default E $(BoolLit it)  { return varRef((VarRef) it); }
	}
	
	// Printing MyVarLang
	interface PrintMyVarLang extends MyVarLangAlg<imp.Imp.IPrint, imp.Imp.IPrint, imp.Imp.IPrint, imp.Imp.IPrint, MyPrint, boolexp.BoolExpressions.IPrint, imp.Imp.IPrint, imp.Imp.IPrint, boolexp.BoolExpressions.IPrint>,
	  PrintMyLang {
		@Override default imp.Imp.IPrint $(Stmt it) {
			if (it instanceof Block)
				return block((Block) it);
			if (it instanceof While)
				return whilee((While) it);
			if (it instanceof Print)
				return print((Print) it);
			if (it instanceof Sleep)
				return sleep((Sleep) it);
			return varDecl((VarDecl) it);
		}

		@Override default boolexp.BoolExpressions.IPrint $(BoolExp it) {
			if (it instanceof Tru)
				return tru((Tru) it);
			if (it instanceof Fals)
				return fals((Fals) it);
			if (it instanceof And)
				return and((And) it);
			if (it instanceof Or)
				return or((Or) it);
			return varRef((VarRef) it);
		}

		@Override default boolexp.BoolExpressions.IPrint $(BoolLit it) {
			if (it instanceof Tru)
				return tru((Tru) it);
			if (it instanceof Fals)
				return fals((Fals) it);
			return varRef((VarRef) it);
		}

		@Override default imp.Imp.IPrint varDecl(VarDecl it) {
			return () -> "var " + it.name + " := " + $(it.value).print();
		}
		@Override default boolexp.BoolExpressions.IPrint varRef(VarRef it) {
			return () -> it.name;
		}
	}
	
	// Evaluating MyVarLang
	static class Context {
		Map<String, Boolean> vars = new HashMap<>();
		public boolean get(String n) { return vars.get(n); }
		public void bind(String n, boolean v) { vars.put(n, v); }
	}
	interface IContextualVoidEval extends imp.Imp.IVoidEval { void eval(Context ctx); }
	interface IContextualBoolEval extends boolexp.BoolExpressions.IEval { boolean eval(Context ctx); }
	interface EvalMyVarLang extends MyVarLangAlg<IContextualVoidEval, IContextualVoidEval, IContextualVoidEval, IContextualVoidEval, IContextualBoolEval, IContextualBoolEval, IContextualVoidEval, IContextualVoidEval, IContextualBoolEval>,
	  EvalMyLang {
		Stack<Context> stack = new Stack<>();
		
		@Override default IContextualVoidEval $(Block it) {
			return new IContextualVoidEval() {
				@Override public void eval() {
					block((Block) it).eval();
				}
				@Override public void eval(Context c) {
					stack.push(c);
					eval();
				}
			};
		}

		@Override default IContextualVoidEval $(Stmt it) {
			if (it instanceof VarDecl)
				return varDecl((VarDecl) it);
			
			return new IContextualVoidEval() {
				@Override public void eval() {
					if (it instanceof Block)
						block((Block) it).eval();
					if (it instanceof While)
						whilee((While) it).eval();
					if (it instanceof Print)
						print((Print) it).eval();
					if (it instanceof Sleep)
						sleep((Sleep) it).eval();
				}
				@Override public void eval(Context c) {
					stack.push(c);
					eval();
				}
			};
		}

		@Override default IContextualBoolEval $(BoolExp it) {
			if (it instanceof VarRef)
				return varRef((VarRef) it);

			return new IContextualBoolEval() {
				@Override public boolean eval() {
					if (it instanceof Tru)
						return tru((Tru) it).eval();
					if (it instanceof Fals)
						return fals((Fals) it).eval();
					if (it instanceof And)
						return and((And) it).eval();
					return or((Or) it).eval();
				}
				@Override public boolean eval(Context c) {
					stack.push(c);
					return eval();
				}
			};
		}

		@Override default IContextualBoolEval $(BoolLit it) {
			if (it instanceof VarRef)
				return varRef((VarRef) it);

			return new IContextualBoolEval() {
				@Override public boolean eval() {
					if (it instanceof Tru)
						return tru((Tru) it).eval();
					return fals((Fals) it).eval();
				}
				@Override public boolean eval(Context c) {
					stack.push(c);
					return eval();
				}
			};
		}
		
		@Override default IContextualVoidEval varDecl(VarDecl it) {
			return new IContextualVoidEval() {
				@Override public void eval() {
					Context c = stack.pop();
					eval(c);
				}
				@Override public void eval(Context c) {
					stack.push(c);
					c.bind(it.name, $(it.value).eval());
				}
			};
		}
		
		@Override default IContextualBoolEval varRef(VarRef it) {
			return new IContextualBoolEval() {
				@Override public boolean eval() {
					Context c = stack.pop();
					return eval(c);
				}
				@Override public boolean eval(Context c) {
					stack.push(c);
					return c.get(it.name);
				}
			};
		}
	}

	public static void main(String[] args) {
		Block b = makePgm();

		imp.Imp.IPrint p = new PrintMyVarLang(){}.$(b);
		System.out.println(p.print());
		
		System.out.println();
		System.out.println("RESULT:");
		IContextualVoidEval e = new EvalMyVarLang(){}.$(b);
		e.eval(new Context());
	}
	
	public static Block makePgm() {
		VarDecl v1 = new VarDecl("a", new Tru());
		VarDecl v2 = new VarDecl("b", new Tru());
		Print p1 = new Print("Before");
		Print p2 = new Print("After");
		Print p3 = new Print("Inside");
		VarDecl v3 = new VarDecl("a", new Fals());
		Sleep s = new Sleep(1);
		BoolExp exp = new And(new VarRef("a"), new VarRef("b"));
		Condition cond = new BoolExpAdapter(exp);
		Block body = new Block(Arrays.asList(p3, s, v3));
		While w = new While(cond, body);
		return new Block(Arrays.asList(v1, v2, p1, w, p2));
	}
}
