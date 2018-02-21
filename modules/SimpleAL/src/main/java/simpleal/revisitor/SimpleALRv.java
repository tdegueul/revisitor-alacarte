package simpleal.revisitor;

import simpleal.Block;
import simpleal.Print;
import simpleal.Stmt;

public interface SimpleALRv<B, S, P extends S> {
	B block(Block it);
	P print(Print it);

	default B $(Block it) { return block(it); }
	default P $(Print it) { return print(it); }
	default S $(Stmt it) {
		return print((Print) it);
	}
}
