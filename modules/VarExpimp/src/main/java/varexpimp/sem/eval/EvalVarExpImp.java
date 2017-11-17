package varexpimp.sem.eval;

import java.util.Stack;

import boolexp.And;
import boolexp.Exp;
import boolexp.Fals;
import boolexp.Lit;
import boolexp.Or;
import boolexp.Tru;
import boolexpimp.sem.eval.EvalBoolExpImp;
import ifstatement.If;
import simpleimp.Block;
import simpleimp.Print;
import simpleimp.Statement;
import simpleimp.Whil;
import sleepstatement.Sleep;
import varexpimp.VarDecl;
import varexpimp.VarRef;
import varexpimp.revisitor.VarExpImpRevisitor;

public interface EvalVarExpImp
  extends VarExpImpRevisitor<IContextBoolEval, IContextVoidEval, IContextVoidEval, IContextVoidEval, IContextVoidEval, IContextVoidEval, IContextVoidEval, IContextBoolEval, IContextBoolEval, IContextVoidEval, IContextBoolEval>,
          EvalBoolExpImp {
	Stack<Context> stack = new Stack<>();

	@Override
	default IContextVoidEval $(Block it) {
		return new IContextVoidEval() {
			@Override public void eval() {
				block((Block) it).eval();
			}
			@Override public void eval(Context c) {
				stack.push(c);
				eval();
			}
		};
	}

	@Override
	default IContextVoidEval $(Statement it) {
		if (it instanceof VarDecl)
			return varDecl((VarDecl) it);
		
		return new IContextVoidEval() {
			@Override public void eval() {
				if (it instanceof Block)
					block((Block) it).eval();
				if (it instanceof Whil)
					whil((Whil) it).eval();
				if (it instanceof If)
					iff((If) it).eval();
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

	@Override
	default IContextBoolEval $(Exp it) {
		if (it instanceof VarRef)
			return varRef((VarRef) it);

		return new IContextBoolEval() {
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

	@Override
	default IContextBoolEval $(Lit it) {
		if (it instanceof VarRef)
			return varRef((VarRef) it);

		return new IContextBoolEval() {
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
	
	@Override
	default IContextVoidEval varDecl(VarDecl it) {
		return new IContextVoidEval() {
			@Override public void eval() {
				Context c = stack.pop();
				eval(c);
			}
			@Override public void eval(Context c) {
				stack.push(c);
				c.bind(it.getName(), $(it.getValue()).eval());
			}
		};
	}
	
	@Override 
	default IContextBoolEval varRef(VarRef it) {
		return new IContextBoolEval() {
			@Override public boolean eval() {
				Context c = stack.pop();
				return eval(c);
			}
			@Override public boolean eval(Context c) {
				stack.push(c);
				return c.get(it.getName());
			}
		};
	}

}
