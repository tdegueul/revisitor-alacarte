package basicfsm.sem.print;

import java.util.stream.Collectors;

import basicfsm.InitialState;
import basicfsm.Machine;
import basicfsm.State;
import basicfsm.Trans;
import basicfsm.revisitor.BasicFsmRv;

public interface PrintBasicFsm extends BasicFsmRv<IPrint, IPrint, IPrint, IPrint, IPrint, IPrint> {
	@Override
	default IPrint machine(Machine it) {
		return () ->
			it.getName() + ":" + System.lineSeparator() +
				it.getStates().stream()
				.map(s -> $(s).print())
				.collect(Collectors.joining(System.lineSeparator()));
	}

	@Override
	default IPrint state(State it) {
		return () ->
			"State " + it.getName() + System.lineSeparator() + "  " +
				it.getOut().stream()
				.map(t -> $(t).print())
				.collect(Collectors.joining(System.lineSeparator() + "  "));
	}

	@Override
	default IPrint trans(Trans it) {
		return () -> "(" + it.getEvent() + ") -> " + it.getTgt().getName() +
				" [" + $(it.getGuard()).print() + "] / " + $(it.getAction()).print();
	}

	@Override
	default IPrint initialState(InitialState it) {
		return () -> "[I] " + state(it).print();
	}

	// No print semantics for Guard & Action
}
