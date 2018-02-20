package boolexp.revisitor;

import boolexp.And;
import boolexp.BinExp;
import boolexp.Exp;
import boolexp.Fals;
import boolexp.Lit;
import boolexp.Not;
import boolexp.Or;
import boolexp.Tru;

public interface BoolExpRv<E> {
	E tru(Tru it);
	E fals(Fals it);
	E not(Not it);
	E and(And it);
	E or(Or it);

	default E $(Exp it) {
		if (it instanceof Tru)
			return tru((Tru) it);
		if (it instanceof Fals)
			return fals((Fals) it);
		if (it instanceof Not)
			return not((Not) it);
		if (it instanceof And)
			return and((And) it);
		return or((Or) it);
	}

	default E $(Lit it) {
		if (it instanceof Tru)
			return tru((Tru) it);
		return fals((Fals) it);
	}

	default E $(BinExp it) {
		if (it instanceof And)
			return and((And) it);
		return or((Or) it);
	}

	default E $(Tru it)  { return tru(it);  }
	default E $(Fals it) { return fals(it); }
	default E $(Not it)  { return not(it);  }
	default E $(And it)  { return and(it);  }
	default E $(Or it)   { return or(it);   }
}
