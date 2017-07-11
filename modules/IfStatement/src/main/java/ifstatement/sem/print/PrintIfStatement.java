package ifstatement.sem.print;

import ifstatement.If;
import ifstatement.revisitor.IfStatementRevisitor;
import simpleimp.sem.print.IPrint;
import simpleimp.sem.print.PrintSimpleImp;

public interface PrintIfStatement
  extends IfStatementRevisitor<IPrint, IPrint, IPrint, IPrint, IPrint, IPrint>,
          PrintSimpleImp {
	@Override
	default IPrint iff(If it) {
		return () ->
			"if (" + $(it.getCondition()).print() + ") {\n" +
			"  " + $(it.getThn()).print() +
			"\n} else {\n" +
			"  " + $(it.getEls()).print() +
			"\n}";
	}
}
