package l1.revisitor;

import l1.A;
import l1.B;

public interface L1Rv<TA, TB> {
	TA a(A it);
	
	TB $(B it); // Dunno yet
	
	default TA $(A it) {
		return a(it); 
	}
}
