package l1.sem;

import l1.A;
import l1.revisitor.L1Rv;

public interface SemL1 extends L1Rv<IEvalA, IEvalB> {
	@Override
	default IEvalA a(A it) {
		return () -> {
			System.out.println("A::evalA()");
			$(it.getB()).evalB();
		};
	}
}
