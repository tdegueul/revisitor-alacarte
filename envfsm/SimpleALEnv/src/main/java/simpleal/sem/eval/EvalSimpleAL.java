package simpleal.sem.eval;

import simpleal.ArithLit;
import simpleal.ArithMinus;
import simpleal.ArithPlus;
import simpleal.Assign;
import simpleal.Block;
import simpleal.Print;
import simpleal.VarRef;
import simpleal.revisitor.SimpleALRv;

public interface EvalSimpleAL extends SimpleALRv<IVoidEval, IVoidEval, IIntEval, IIntEval, IIntEval, IIntEval, IIntEval, IIntEval, IVoidEval, IVoidEval> {
	@Override
	default IVoidEval block(Block it) {
		return (env) -> it.getStmts().forEach(s -> $(s).eval(env));
	}
	
	@Override
	default IIntEval varRef(VarRef it) {
		return (env) -> env.get(it.getName());
	}
	
	@Override
	default IIntEval arithLit(ArithLit it) {
		return (env) -> it.getVal();
	}
	
	@Override
	default IIntEval arithPlus(ArithPlus it) {
		return (env) -> $(it.getLhs()).eval(env) + $(it.getRhs()).eval(env);
	}
	
	@Override
	default IIntEval arithMinus(ArithMinus it) {
		return (env) -> $(it.getLhs()).eval(env) - $(it.getRhs()).eval(env);
	}

	@Override
	default IVoidEval print(Print it) {
		return (env) -> System.out.println(env.get(it.getName()));
	}
	
	@Override
	default IVoidEval assign(Assign it) {
		return (env) -> env.bind(it.getName(), $(it.getVal()).eval(env));
	}
}
