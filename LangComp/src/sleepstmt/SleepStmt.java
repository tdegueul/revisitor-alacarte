package sleepstmt;

import java.util.concurrent.TimeUnit;

import imp.Imp.Block;
import imp.Imp.EvalImp;
import imp.Imp.IConditionEval;
import imp.Imp.IConditionPrint;
import imp.Imp.ImpAlg;
import imp.Imp.Print;
import imp.Imp.PrintImp;
import imp.Imp.Stmt;
import imp.Imp.While;

public class SleepStmt {
	// SleepStmt "metamodel"
	public static class Sleep extends Stmt {
		int duration;
		public Sleep(int i) { duration = i; }
	}

	// SleepStmt Revisitor
	public interface SleepAlg<S, B extends S, W extends S, P extends S, C> extends ImpAlg<S, B, W, P, C> {
		S sleep(Sleep it);
		
		default S $(Sleep it) { return sleep(it); }
		
		@Override default S $(Stmt it) {
			if (it instanceof Block)
				return block((Block) it);
			if (it instanceof While)
				return whilee((While) it);
			if (it instanceof Print)
				return print((Print) it);
			return sleep((Sleep) it);
		}
	}
	
	// Printing SleepStmt
	public interface PrintSleep<C extends IConditionPrint> extends SleepAlg<imp.Imp.IPrint, imp.Imp.IPrint, imp.Imp.IPrint, imp.Imp.IPrint, C>,
	  PrintImp<C> {
		@Override default imp.Imp.IPrint sleep(Sleep it) {
			return () -> "sleep(" + it.duration + ")";
		}
	}
	
	// Evaluating SleepStmt
	public interface EvalSleep<C extends IConditionEval> extends SleepAlg<imp.Imp.IVoidEval, imp.Imp.IVoidEval, imp.Imp.IVoidEval, imp.Imp.IVoidEval, C>,
		EvalImp<C> {
		@Override default imp.Imp.IVoidEval sleep(Sleep it) {
			return () -> {
				try {
					TimeUnit.SECONDS.sleep(it.duration);
				} catch (InterruptedException e) {}
			};
		}
	}
}
