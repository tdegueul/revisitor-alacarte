package fsm.sem.print;

import java.util.stream.Collectors;

import fsm.FinalState;
import fsm.InitialState;
import fsm.Machine;
import fsm.State;
import fsm.Transition;
import fsm.revisitor.FsmRevisitor;

public interface PrintFsm
  extends FsmRevisitor<IPrint, IPrint, IPrint, IPrint, IPrint> {
	@Override
	default IPrint machine(Machine it) {
		return () ->
			it.getName() + ":\n" +
				it.getStates().stream()
				.map(s -> $(s).print())
				.collect(Collectors.joining("\n"));
	}

	@Override
	default IPrint state(State it) {
		return () ->
			"State " + it.getName() + "\n  " +
				it.getOutgoing().stream()
				.map(t -> $(t).print())
				.collect(Collectors.joining("\n  "));
	}

	@Override
	default IPrint transition(Transition it) {
		return () -> "(" + it.getEvent() + ") -> " + it.getTarget().getName();
	}

	@Override
	default IPrint initialState(InitialState it) {
		return () -> "[I] " + state(it).print();
	}

	@Override
	default IPrint finalState(FinalState it) {
		return () -> "[F] " + state(it).print();
	}
}
