package simpleimp.sem.eval;

import simpleimp.Block;
import simpleimp.Print;
import simpleimp.Whil;
import simpleimp.revisitor.SimpleImpRevisitor;

public interface EvalSimpleImp
  extends SimpleImpRevisitor<IVoidEval, IVoidEval, IVoidEval, IVoidEval, IBoolEval> {
	@Override
	default IVoidEval block(Block it) {
		return () ->
			it.getStatements().stream()
			.forEach(s -> $(s).eval());
	}

	@Override
	default IVoidEval whil(Whil it) {
		return () -> {
			while ($(it.getCondition()).eval())
				$(it.getBody()).eval();
		};
	}

	@Override
	default IVoidEval print(Print it) {
		return () -> System.out.println(it.getMsg());
	}
}
