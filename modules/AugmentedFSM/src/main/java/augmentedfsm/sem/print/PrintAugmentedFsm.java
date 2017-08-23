package augmentedfsm.sem.print;

import augmentedfsm.ExecutableState;
import augmentedfsm.GuardedTransition;
import augmentedfsm.revisitor.AugmentedFsmRevisitor;
import boolexp.sem.print.PrintBoolExp;
import fsm.sem.print.PrintFsm;
import simpleimp.Condition;
import simpleimp.sem.print.PrintSimpleImp;

public interface PrintAugmentedFsm
  extends AugmentedFsmRevisitor<fsm.sem.print.IPrint, fsm.sem.print.IPrint, fsm.sem.print.IPrint, fsm.sem.print.IPrint, fsm.sem.print.IPrint, fsm.sem.print.IPrint, fsm.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, boolexp.sem.print.IPrint>,
          PrintFsm,
          PrintSimpleImp,
          PrintBoolExp {

	@Override
	default fsm.sem.print.IPrint executableState(ExecutableState it) {
		return () -> $(it.getBody()).print() + " :: " + PrintFsm.super.state(it).print();
	}

	@Override
	default fsm.sem.print.IPrint guardedTransition(GuardedTransition it) {
		return () -> PrintFsm.super.transition(it).print() + " :: " + $(it.getGuard()).print();
	}

	@Override
	default simpleimp.sem.print.IPrint condition(Condition it) {
		return () -> "";
	}

}
