package boolexp.sem.eval;

import boolexp.And;
import boolexp.Fals;
import boolexp.Not;
import boolexp.Or;
import boolexp.Tru;
import boolexp.revisitor.BoolExpRevisitor;

public interface EvalBoolExp extends BoolExpRevisitor<IEval> {
	@Override
	default IEval tru(Tru it) {
		return () -> true;
	}

	@Override
	default IEval fals(Fals it) {
		return () -> false;
	}

	@Override
	default IEval not(Not it) {
		return () -> !($(it.getExp()).eval());
	}

	@Override
	default IEval and(And it) {
		return () -> $(it.getLhs()).eval() && $(it.getRhs()).eval();
	}

	@Override
	default IEval or(Or it) {
		return () -> $(it.getLhs()).eval() || $(it.getRhs()).eval();
	}
}
