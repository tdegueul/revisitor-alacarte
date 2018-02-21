package simpleal.sem.eval;

import simpleal.Block;
import simpleal.Print;
import simpleal.revisitor.SimpleALRv;

public interface EvalSimpleAL extends SimpleALRv<IEval, IEval, IEval> {
	@Override
	default IEval block(Block it) {
		return () -> it.getStmts().forEach(s -> $(s).eval());
	}
	
	@Override
	default IEval print(Print it) {
		return () -> System.out.println(it.getMsg());
	}
}
