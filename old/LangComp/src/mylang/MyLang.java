package mylang;

import java.util.Arrays;

import boolexp.BoolExpressions.And;
import boolexp.BoolExpressions.BoolExp;
import boolexp.BoolExpressions.BoolExpAlg;
import boolexp.BoolExpressions.EvalBoolExp;
import boolexp.BoolExpressions.PrintBoolExp;
import boolexp.BoolExpressions.Tru;
import imp.Imp.Block;
import imp.Imp.Condition;
import imp.Imp.EvalImp;
import imp.Imp.IConditionEval;
import imp.Imp.IConditionPrint;
import imp.Imp.IVoidEval;
import imp.Imp.ImpAlg;
import imp.Imp.Print;
import imp.Imp.PrintImp;
import imp.Imp.While;
import sleepstmt.SleepStmt.EvalSleep;
import sleepstmt.SleepStmt.PrintSleep;
import sleepstmt.SleepStmt.Sleep;
import sleepstmt.SleepStmt.SleepAlg;

// MyLang combines IMP w/ SleepStmt w/ BoolExp
public class MyLang {
	// MyLang "metamodel"
	public static class BoolExpAdapter implements Condition {
		BoolExp adaptee;
		public BoolExpAdapter(BoolExp a) { adaptee = a; }
		@Override public BoolExp getAdaptee() { return adaptee; }
	}
	
	// MyLang Revisitor
	public interface MyLangAlg<S, B extends S, W extends S, P extends S, C, E, SL extends S>
	  extends ImpAlg<S, B, W, P, C>, BoolExpAlg<E>, SleepAlg<S, B, W, P, C> {

	}
	
	// Printing MyLang programs
	public interface MyPrint extends IConditionPrint {}
	public interface PrintMyLang
	  extends MyLangAlg<imp.Imp.IPrint, imp.Imp.IPrint, imp.Imp.IPrint, imp.Imp.IPrint, MyPrint, boolexp.BoolExpressions.IPrint, imp.Imp.IPrint>,
	  PrintImp<MyPrint>, PrintBoolExp, PrintSleep<MyPrint> {
		@Override default MyPrint condition(Condition it) {
			// Actually, this cast/getAdaptee should be done in the $() method somewhere
			return () -> $((BoolExp) it.getAdaptee()).print();
		}
	}
	
	// Evaluating MyLang programs
	public interface MyEval extends IConditionEval {}
	public interface EvalMyLang
	  extends MyLangAlg<imp.Imp.IVoidEval, imp.Imp.IVoidEval, imp.Imp.IVoidEval, imp.Imp.IVoidEval, MyEval, boolexp.BoolExpressions.IEval, imp.Imp.IVoidEval>,
	  EvalImp<MyEval>, EvalBoolExp, EvalSleep<MyEval> {
		@Override default MyEval condition(Condition it) {
			return () -> $((BoolExp) it.getAdaptee()).eval();
		}
	}

	public static void main(String[] args) {
		Block b = makePgm();

		imp.Imp.IPrint p = new PrintMyLang(){}.$(b);
		System.out.println(p.print());
		
		System.out.println();
		System.out.println("RESULT:");
		IVoidEval e = new EvalMyLang(){}.$(b);
		e.eval();
	}
	
	public static Block makePgm() {
		Print p1 = new Print("Before");
		Print p2 = new Print("After");
		Print p3 = new Print("Inside");
		Sleep s = new Sleep(1);
		BoolExp exp = new And(new Tru(), new Tru());
		Condition cond = new BoolExpAdapter(exp);
		Block body = new Block(Arrays.asList(p3, s));
		While w = new While(cond, body);
		return new Block(Arrays.asList(p1, w, p2));
	}
}
