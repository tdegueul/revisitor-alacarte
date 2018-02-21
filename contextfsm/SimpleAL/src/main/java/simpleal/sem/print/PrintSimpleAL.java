package simpleal.sem.print;

import java.util.stream.Collectors;

import simpleal.Bind;
import simpleal.Block;
import simpleal.Print;
import simpleal.PrintVar;
import simpleal.revisitor.SimpleALRv;

public interface PrintSimpleAL extends SimpleALRv<IPrint, IPrint, IPrint, IPrint, IPrint> {
	@Override
	default IPrint block(Block it) {
		return () ->
			it.getStmts().stream()
			.map(s -> $(s).print())
			.collect(Collectors.joining(System.lineSeparator()));
	}

	@Override
	default IPrint print(Print it) {
		return () -> "print(\"" + it.getMsg() + "\")";
	}
	
	@Override
	default IPrint printVar(PrintVar it) {
		return () -> "print(" + it.getVarName() + ")";
	}
	
	@Override
	default IPrint bind(Bind it) {
		return () -> it.getName() + " := \"" + it.getVal() + "\"";
	}
}
