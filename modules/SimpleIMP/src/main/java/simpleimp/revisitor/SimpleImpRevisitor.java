package simpleimp.revisitor;

import simpleimp.Block;
import simpleimp.Condition;
import simpleimp.Print;
import simpleimp.Statement;
import simpleimp.Whil;

public interface SimpleImpRevisitor<S, B extends S, W extends S, P extends S, C> {
	B block(Block it);
	W whil(Whil it);
	P print(Print it);
	C condition(Condition it);

	default S $(Statement it) {
		if (it instanceof Block)
			return block((Block) it);
		if (it instanceof Whil)
			return whil((Whil) it);
		return print((Print) it);
	}
	
	default S $(Block it)     { return block(it);     }
	default W $(Whil it)      { return whil(it);      }
	default P $(Print it)     { return print(it);     }
	default C $(Condition it) { return condition(it); }
}
