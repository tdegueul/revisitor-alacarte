package boolexpimp.sem.eval;

import boolexp.sem.eval.EvalBoolExp;
import boolexpimp.BoolExpCondition;
import boolexpimp.revisitor.BoolExpImpRevisitor;
import ifstatement.sem.eval.EvalIfStatement;
import simpleimp.Condition;
import simpleimp.sem.eval.EvalSimpleImp;
import sleepstatement.sem.eval.EvalSleepStatement;

public interface EvalBoolExpImp
  extends BoolExpImpRevisitor<boolexp.sem.eval.IEval, simpleimp.sem.eval.IVoidEval, simpleimp.sem.eval.IVoidEval, simpleimp.sem.eval.IVoidEval, simpleimp.sem.eval.IVoidEval, simpleimp.sem.eval.IVoidEval, simpleimp.sem.eval.IVoidEval, simpleimp.sem.eval.IBoolEval, simpleimp.sem.eval.IBoolEval>,
          EvalBoolExp,
          EvalSimpleImp,
          EvalSleepStatement,
          EvalIfStatement {
	@Override
	default simpleimp.sem.eval.IBoolEval boolExpCondition(BoolExpCondition it) {
		return () -> $(it.getExp()).eval();
	}
	
	@Override
	default simpleimp.sem.eval.IBoolEval condition(Condition it) {
		throw new RuntimeException("Shouldn't be there...");
	}
}
