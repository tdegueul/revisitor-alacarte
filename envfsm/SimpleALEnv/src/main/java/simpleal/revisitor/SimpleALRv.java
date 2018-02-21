package simpleal.revisitor;

import simpleal.Bind;
import simpleal.Block;
import simpleal.Print;
import simpleal.PrintVar;
import simpleal.Stmt;

public interface SimpleALRv<B, S, P extends S, PV extends S, BI extends S> {
	B  block(Block it);
	P  print(Print it);
	PV printVar(PrintVar it);
	BI bind(Bind it);

	default B $(Block it) { return block(it); }
	default P $(Print it) { return print(it); }
	default PV $(PrintVar it) { return printVar(it); }
	default BI $(Bind it) { return bind(it); }
	default S $(Stmt it) {
		if (it instanceof Print)
			return print((Print) it);
		if (it instanceof Bind)
			return bind((Bind) it);
		return printVar((PrintVar) it);
	}
}
