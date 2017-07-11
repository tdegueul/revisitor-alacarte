package sleepstatement.sem.eval;

import simpleimp.sem.eval.EvalSimpleImp;
import simpleimp.sem.eval.IBoolEval;
import simpleimp.sem.eval.IVoidEval;
import sleepstatement.Sleep;
import sleepstatement.revisitor.SleepStatementRevisitor;

public interface EvalSleepStatement
  extends SleepStatementRevisitor<IVoidEval, IVoidEval, IVoidEval, IVoidEval, IVoidEval, IBoolEval>,
          EvalSimpleImp {
	@Override
	default IVoidEval sleep(Sleep it) {
		return () -> {
			try {
				Thread.sleep(it.getDuration());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
	}
}
