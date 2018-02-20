package l3.revisitor;

import l1.B;
import l1.revisitor.L1Rv;
import l2.revisitor.L2Rv;
import l3.BindB;

public interface L3Rv<TA, TB, TC, TBindB extends TB>
	extends L1Rv<TA, TB>, L2Rv<TC> {
	
	TBindB bindB(BindB it);

	@Override
	default TB $(B it) {
		return $(((BindB) it));
	}
	
	default TBindB $(BindB it) {
		return bindB(it);
	}
	
}
