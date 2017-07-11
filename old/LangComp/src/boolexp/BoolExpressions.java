package boolexp;

public class BoolExpressions {
	// BoolExp "metamodel"
	public abstract static class BoolExp {}
	public abstract static class BoolLit extends BoolExp {}
	public abstract static class BinBool extends BoolExp {
		BoolExp lhs;
		BoolExp rhs;
		public BinBool(BoolExp l, BoolExp r) { lhs = l; rhs = r; }
	}
	public static class Tru extends BoolLit {}
	public static class Fals extends BoolLit {}
	public static class And extends BinBool {
		public And(BoolExp l, BoolExp r) { super(l, r); }
	}
	public static class Or extends BinBool {
		public Or(BoolExp l, BoolExp r) { super(l, r); }
	}

	// BoolExp Revisitor
	public interface BoolExpAlg<E> {
		E tru(Tru it);
		E fals(Fals it);
		E and(And it);
		E or(Or it);

		default E $(BoolExp it) {
			if (it instanceof Tru)
				return tru((Tru) it);
			if (it instanceof Fals)
				return fals((Fals) it);
			if (it instanceof And)
				return and((And) it);
			return or((Or) it);
		}
		default E $(BoolLit it) {
			if (it instanceof Tru)
				return tru((Tru) it);
			return fals((Fals) it);
		}
		default E $(BinBool it) {
			if (it instanceof And)
				return and((And) it);
			return or((Or) it);
		}
		default E $(Tru it)  { return tru(it);  }
		default E $(Fals it) { return fals(it); }
		default E $(And it)  { return and(it);  }
		default E $(Or it)   { return or(it);   }
	}

	// Printing BoolExp
	public interface IPrint { String print(); }
	public interface PrintBoolExp extends BoolExpAlg<IPrint> {
		@Override default IPrint tru(Tru it)   { return () -> "T"; }
		@Override default IPrint fals(Fals it) { return () -> "F"; }
		@Override default IPrint and(And it)   { return () -> $(it.lhs).print() + " ∧ " + $(it.rhs).print(); }
		@Override default IPrint or(Or it)     { return () -> $(it.lhs).print() + " ∨ " + $(it.rhs).print(); }
	}
	
	// Evaluating BoolExp
	public interface IEval { boolean eval(); }
	public interface EvalBoolExp extends BoolExpAlg<IEval> {
		@Override default IEval tru(Tru it)   { return () -> true; }
		@Override default IEval fals(Fals it) { return () -> false; }
		@Override default IEval and(And it)   { return () -> $(it.lhs).eval() && $(it.rhs).eval(); }
		@Override default IEval or(Or it)     { return () -> $(it.lhs).eval() || $(it.rhs).eval(); }
	}
}
