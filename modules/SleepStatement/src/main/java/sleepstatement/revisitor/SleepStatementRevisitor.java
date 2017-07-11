package sleepstatement.revisitor;

import simpleimp.Statement;
import simpleimp.revisitor.SimpleImpRevisitor;
import sleepstatement.Sleep;

public interface SleepStatementRevisitor<S, B extends S, W extends S, P extends S, SL extends S, C>
  extends SimpleImpRevisitor<S, B, W, P, C> {
	SL sleep(Sleep it);

	default S $(Statement it) {
		if (it instanceof Sleep)
			return sleep((Sleep) it);
		return SimpleImpRevisitor.super.$(it);
	}

	default SL $(Sleep it) { return sleep(it); }
}
