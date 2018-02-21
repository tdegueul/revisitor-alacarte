package simpleal.sem.print;

import java.util.stream.Collectors;

import simpleal.Block;
import simpleal.Print;
import simpleal.revisitor.SimpleALRv;

public interface PrintSimpleAL extends SimpleALRv<IPrint, IPrint, IPrint> {
	@Override
	default IPrint block(Block it) {
		return () ->
			it.getStmts().stream()
			.map(s -> $(s).print())
			.collect(Collectors.joining(System.lineSeparator()));
	}

	@Override
	default IPrint print(Print it) {
		return () -> it.getMsg();
	}
}
