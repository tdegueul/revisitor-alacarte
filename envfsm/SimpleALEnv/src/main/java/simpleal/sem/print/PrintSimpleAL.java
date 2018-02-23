package simpleal.sem.print;

import java.util.stream.Collectors;

import simpleal.ArithLit;
import simpleal.ArithMinus;
import simpleal.ArithPlus;
import simpleal.Assign;
import simpleal.Block;
import simpleal.Print;
import simpleal.VarRef;
import simpleal.revisitor.SimpleALRv;

public interface PrintSimpleAL extends SimpleALRv<IPrint, IPrint, IPrint, IPrint, IPrint, IPrint, IPrint, IPrint, IPrint, IPrint> {
	@Override
	default IPrint block(Block it) {
		return () ->
			it.getStmts().stream()
			.map(s -> $(s).print())
			.collect(Collectors.joining(System.lineSeparator()));
	}
	
	@Override
	default IPrint varRef(VarRef it) {
		return () -> it.getName();
	}
	
	@Override
	default IPrint arithLit(ArithLit it) {
		return () -> Integer.toString(it.getVal());
	}
	
	@Override
	default IPrint arithPlus(ArithPlus it) {
		return () -> $(it.getLhs()).print() + " + " + $(it.getRhs()).print();
	}
	
	@Override
	default IPrint arithMinus(ArithMinus it) {
		return () -> $(it.getLhs()).print() + " - " + $(it.getRhs()).print();
	}

	@Override
	default IPrint print(Print it) {
		return () -> "print(" + it.getName() + ")";
	}
	
	@Override
	default IPrint assign(Assign it) {
		return () -> it.getName() + " := " + $(it.getVal()).print();
	}
}
