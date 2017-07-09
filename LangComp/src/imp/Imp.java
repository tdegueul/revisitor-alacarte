package imp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import common.Exposed;
import common.Required;
import common.RequiredConcept;

public class Imp {
	// IMP "metamodel"
	@Exposed public abstract static class Stmt {}
	public static class Block extends Stmt {
		List<Stmt> stmts = new ArrayList<>();
		public Block(List<Stmt> l) { stmts = l; }
	}
	public static class While extends Stmt {
		Condition cond;
		Block body;
		public While(Condition c, Block b) { cond = c; body = b; }
	}
	public static class Print extends Stmt {
		String msg;
		public Print(String m) { msg = m; }
	}
	// ie. there's a Condition somewhere
	@Required public interface Condition extends RequiredConcept {}

	// IMP Revisitor
	public interface ImpAlg<S, B extends S, W extends S, P extends S, @Required C> {
		B block(Block it);
		W whilee(While it);
		P print(Print it);
		@Required C condition(Condition it);

		default S $(Stmt it) {
			if (it instanceof Block)
				return block((Block) it);
			if (it instanceof While)
				return whilee((While) it);
			return print((Print) it);
		}
		
		default S $(Block it) { return block(it); }
		default W $(While it) { return whilee(it); }
		default P $(Print it) { return print(it); }
		default @Required C $(Condition it) { return condition(it); }
	}

	// Printing IMP programs
	public interface IPrint { String print(); }
	// ie. in the context of printing, the Condition must be print()able
	public interface IConditionPrint { String print(); }
	public interface PrintImp<C extends IConditionPrint>
	  extends ImpAlg<IPrint, IPrint, IPrint, IPrint, C> {
		@Override default IPrint block(Block it) {
			return () ->
				it.stmts.stream()
				.map(s -> $(s).print())
				.collect(Collectors.joining("\n"));
		}
		@Override default IPrint whilee(While it) {
			return () ->
				"while (" + $(it.cond).print() + ") {\n" +
				"  " + $(it.body).print() + "\n" +
				"}"
			;
		}
		@Override default IPrint print(Print it) {
			return () -> "print(\"" + it.msg + "\");";
		}
	}
	
	// Evaluating IMP programs
	public interface IVoidEval { void eval(); }
	public interface IBoolEval { boolean eval(); }
	// ie. in the context of evaluation, the Condition must be eval()uable
	public interface IConditionEval { boolean eval(); }
	public interface EvalImp <C extends IConditionEval>
	  extends ImpAlg<IVoidEval, IVoidEval, IVoidEval, IVoidEval, C> {
		@Override default IVoidEval block(Block it) {
			return () ->
				it.stmts.stream()
				.forEach(s -> $(s).eval());
		}
		@Override default IVoidEval whilee(While it) {
			return () -> {
				while($(it.cond).eval())
					$(it.body).eval();
			};
		}
		@Override default IVoidEval print(Print it) {
			return () -> System.out.println(it.msg);
		}
	}
}
