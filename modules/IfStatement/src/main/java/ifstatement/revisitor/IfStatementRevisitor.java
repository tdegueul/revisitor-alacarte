package ifstatement.revisitor;

import ifstatement.If;
import simpleimp.Statement;
import simpleimp.revisitor.SimpleImpRevisitor;

public interface IfStatementRevisitor<S, B extends S, W extends S, P extends S, I extends S, C>
  extends SimpleImpRevisitor<S, B, W, P, C> {
	I iff(If it);

	default S $(Statement it) {
		if (it instanceof If)
			return iff((If) it);
		return SimpleImpRevisitor.super.$(it);
	}
}
