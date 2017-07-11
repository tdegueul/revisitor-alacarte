package simpleimp.sem.print;

import java.util.stream.Collectors;

import simpleimp.Block;
import simpleimp.Print;
import simpleimp.Whil;
import simpleimp.revisitor.SimpleImpRevisitor;

public interface PrintSimpleImp
  extends SimpleImpRevisitor<IPrint, IPrint, IPrint, IPrint, IPrint> {
	@Override
	default IPrint block(Block it) {
		return () ->
			it.getStatements().stream()
			.map(s -> $(s).print())
			.collect(Collectors.joining("\n"));
	}
	
	@Override
	default IPrint whil(Whil it) {
		return () ->
			"while (" + $(it.getCondition()).print() + ") {\n" +
			"  " + $(it.getBody()).print() + "\n" +
			"}";
	}
	
	@Override
	default IPrint print(Print it) {
		return () -> "print(\"" + it.getMsg() + "\")";
	}
}
