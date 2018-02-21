package simpleal.sem.eval;

import simpleal.Bind;
import simpleal.Block;
import simpleal.Print;
import simpleal.PrintVar;
import simpleal.revisitor.SimpleALRv;

public interface EvalSimpleAL extends SimpleALRv<IEval, IEval, IEval, IEval, IEval> {
	@Override
	default IEval block(Block it) {
		return (env) -> it.getStmts().forEach(s -> $(s).eval(env));
	}
	
	@Override
	default IEval print(Print it) {
		return (env) -> System.out.println(it.getMsg());
	}
	
	@Override
	default IEval printVar(PrintVar it) {
		return (env) -> System.out.println(env.get(it.getVarName()));
	}
	
	@Override
	default IEval bind(Bind it) {
		return (env) -> env.bind(it.getName(), it.getVal());
	}
}
