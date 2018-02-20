package boolexp.sem.print;

import boolexp.And;
import boolexp.Fals;
import boolexp.Not;
import boolexp.Or;
import boolexp.Tru;
import boolexp.revisitor.BoolExpRv;

public interface PrintBoolExp extends BoolExpRv<IPrint> {
	@Override
	default IPrint tru(Tru it) {
		return () -> "T";
	}

	@Override
	default IPrint fals(Fals it) {
		return () -> "F";
	}

	@Override
	default IPrint not(Not it) {
		return () -> "¬" + $(it.getExp()).print();
	}

	@Override
	default IPrint and(And it) {
		return () -> "(" + $(it.getLhs()).print() + " ∧ " + $(it.getRhs()).print() + ")";
	}

	@Override
	default IPrint or(Or it) {
		return () -> "(" + $(it.getLhs()).print() + " ∨ " + $(it.getRhs()).print() + ")";
	}
}
