package boolexp.sem.eval;

import boolexp.And;
import boolexp.Fals;
import boolexp.Not;
import boolexp.Or;
import boolexp.Tru;
import boolexp.VarRef;
import boolexp.revisitor.BoolExpRv;

public interface EvalBoolExp extends BoolExpRv<IEval> {
	@Override
	default IEval tru(Tru it) {
		return (env) -> true;
	}

	@Override
	default IEval fals(Fals it) {
		return (env) -> false;
	}

	@Override
	default IEval not(Not it) {
		return (env) -> !($(it.getExp()).eval(env));
	}

	@Override
	default IEval and(And it) {
		return (env) -> $(it.getLhs()).eval(env) && $(it.getRhs()).eval(env);
	}

	@Override
	default IEval or(Or it) {
		return (env) -> $(it.getLhs()).eval(env) || $(it.getRhs()).eval(env);
	}
	
	@Override
	default IEval varRef(VarRef it) {
		return (env) -> env.get(it.getName());
	}
}
