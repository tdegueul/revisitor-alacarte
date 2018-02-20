package l2.revisitor;

import l2.C;

public interface L2Rv<TC> {
	TC c(C it);
	
	default TC $(C it) {
		return c(it);
	}
}
