package l2.sem;

import l2.C;
import l2.revisitor.L2Rv;

public interface SemL2 extends L2Rv<IEvalC> {
	
	@Override
	default IEvalC c(C it) {
		return () -> {
			System.out.println("C::evalC()");
		};
	}

}
