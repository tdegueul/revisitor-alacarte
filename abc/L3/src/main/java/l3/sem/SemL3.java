package l3.sem;

import l1.sem.IEvalA;
import l1.sem.IEvalB;
import l1.sem.SemL1;
import l2.sem.IEvalC;
import l2.sem.SemL2;
import l3.BindB;
import l3.revisitor.L3Rv;

public interface SemL3
	extends
		L3Rv<IEvalA, IEvalB, IEvalC, IEvalB>,
		SemL1,
		SemL2 {
	
	@Override
	default IEvalB bindB(BindB it) {
		// i.e. IEvalB & IEvalC return types must be compatible
		return () -> $(it.getDelegate()).evalC();
	}

}
