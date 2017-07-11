package boolexpimp.revisitor;

import boolexp.revisitor.BoolExpRevisitor;
import boolexpimp.BoolExpCondition;
import ifstatement.If;
import ifstatement.revisitor.IfStatementRevisitor;
import simpleimp.Condition;
import simpleimp.Statement;
import simpleimp.revisitor.SimpleImpRevisitor;
import sleepstatement.revisitor.SleepStatementRevisitor;

public interface BoolExpImpRevisitor<E, S, B extends S, W extends S, P extends S, SL extends S, I extends S, BEC extends C, C>
  extends BoolExpRevisitor<E>,
          SimpleImpRevisitor<S, B, W, P, C>,
          SleepStatementRevisitor<S, B, W, P, SL, C>,
          IfStatementRevisitor<S, B, W, P, I, C> {

	BEC boolExpCondition(BoolExpCondition it);

	@Override
	default S $(Statement it) {
		if (it instanceof If)
			return IfStatementRevisitor.super.$(it);
		return SleepStatementRevisitor.super.$(it);
	}

	@Override
	default C $(Condition it) {
		return boolExpCondition((BoolExpCondition) it);
	}

	default BEC $(BoolExpCondition it) { return boolExpCondition(it); }
}
