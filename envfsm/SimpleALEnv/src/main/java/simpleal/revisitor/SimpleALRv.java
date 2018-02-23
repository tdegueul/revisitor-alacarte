package simpleal.revisitor;

import simpleal.Arith;
import simpleal.ArithLit;
import simpleal.ArithMinus;
import simpleal.ArithOp;
import simpleal.ArithPlus;
import simpleal.Assign;
import simpleal.Block;
import simpleal.Print;
import simpleal.Stmt;
import simpleal.VarRef;

public interface SimpleALRv<B, S, A, VR extends A, AL extends A, AO extends A, AP extends AO, AM extends AO, P extends S, AS extends S> {
	B  block(Block it);
	VR varRef(VarRef it);
	AL arithLit(ArithLit it);
	AP arithPlus(ArithPlus it);
	AM arithMinus(ArithMinus it);
	P  print(Print it);
	AS assign(Assign it);

	default B  $(Block it) { return block(it); }
	default VR $(VarRef it) { return varRef(it); }
	default AL $(ArithLit it) { return arithLit(it); }
	default AP $(ArithPlus it) { return arithPlus(it); }
	default AM $(ArithMinus it) { return arithMinus(it); }
	default P  $(Print it) { return print(it); }
	default AS $(Assign it) { return assign(it); }

	default S $(Stmt it) {
		if (it instanceof Print)
			return print((Print) it);
		else return assign((Assign) it);
	}

	default A $(Arith it) {
		if (it instanceof ArithLit)
			return arithLit((ArithLit) it);
		if (it instanceof ArithPlus)
			return arithPlus((ArithPlus) it);
		if (it instanceof ArithMinus)
			return arithMinus((ArithMinus) it);
		return varRef((VarRef) it);
	}

	default AO $(ArithOp it) {
		if (it instanceof ArithPlus)
			return arithPlus((ArithPlus) it);
		return arithMinus((ArithMinus) it);
	}
}
