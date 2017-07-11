package sleepstatement.sem.print;

import simpleimp.sem.print.IPrint;
import simpleimp.sem.print.PrintSimpleImp;
import sleepstatement.Sleep;
import sleepstatement.revisitor.SleepStatementRevisitor;

public interface PrintSleepStatement
  extends SleepStatementRevisitor<IPrint, IPrint, IPrint, IPrint, IPrint, IPrint>,
          PrintSimpleImp {
	@Override
	default IPrint sleep(Sleep it) {
		return () -> "sleep(" + it.getDuration() + ")";
	}
}
