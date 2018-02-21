package fullfsm.sem.print;

import basicfsm.sem.print.PrintBasicFsm;
import boolexp.sem.print.PrintBoolExp;
import fullfsm.BindAction;
import fullfsm.BindGuard;
import fullfsm.revisitor.FullFsmRv;
import simpleal.sem.print.PrintSimpleAL;

public interface PrintFullFsm
	extends FullFsmRv<basicfsm.sem.print.IPrint, basicfsm.sem.print.IPrint, basicfsm.sem.print.IPrint, basicfsm.sem.print.IPrint, basicfsm.sem.print.IPrint, basicfsm.sem.print.IPrint, boolexp.sem.print.IPrint, simpleal.sem.print.IPrint, simpleal.sem.print.IPrint, simpleal.sem.print.IPrint, basicfsm.sem.print.IPrint, basicfsm.sem.print.IPrint>,
	        PrintBoolExp,
	        PrintSimpleAL,
	        PrintBasicFsm
{

	@Override
	default basicfsm.sem.print.IPrint bindAction(BindAction it) {
		return () -> $(it.getBound()).print();
	}
	
	@Override
	default basicfsm.sem.print.IPrint bindGuard(BindGuard it) {
		return () -> $(it.getBound()).print();
	}
	
}