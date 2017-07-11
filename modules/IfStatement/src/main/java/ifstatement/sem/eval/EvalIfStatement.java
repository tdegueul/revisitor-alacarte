package ifstatement.sem.eval;

import ifstatement.If;
import ifstatement.revisitor.IfStatementRevisitor;
import simpleimp.sem.eval.EvalSimpleImp;
import simpleimp.sem.eval.IBoolEval;
import simpleimp.sem.eval.IVoidEval;

public interface EvalIfStatement
  extends IfStatementRevisitor<IVoidEval, IVoidEval, IVoidEval, IVoidEval, IVoidEval, IBoolEval>,
          EvalSimpleImp {
	@Override
	default IVoidEval iff(If it) {
		return () -> {
			if ($(it.getCondition()).eval())
				$(it.getThn()).eval();
			else
				$(it.getEls()).eval();
		};
	}
}
