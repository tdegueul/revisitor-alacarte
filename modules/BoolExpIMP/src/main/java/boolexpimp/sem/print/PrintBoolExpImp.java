package boolexpimp.sem.print;

import boolexp.sem.print.PrintBoolExp;
import boolexpimp.BoolExpCondition;
import boolexpimp.revisitor.BoolExpImpRevisitor;
import ifstatement.sem.print.PrintIfStatement;
import simpleimp.Condition;
import simpleimp.sem.print.PrintSimpleImp;
import sleepstatement.sem.print.PrintSleepStatement;

public interface PrintBoolExpImp
  extends BoolExpImpRevisitor<boolexp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint>,
          PrintBoolExp,
          PrintSimpleImp,
          PrintSleepStatement,
          PrintIfStatement {
	@Override
	default simpleimp.sem.print.IPrint boolExpCondition(BoolExpCondition it) {
		return () -> $(it.getExp()).print();
	}
	
	@Override
	default simpleimp.sem.print.IPrint condition(Condition it) {
		throw new RuntimeException("Shouldn't be there...");
	}
}
