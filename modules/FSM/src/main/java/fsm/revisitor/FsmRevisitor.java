package fsm.revisitor;

import fsm.FinalState;
import fsm.InitialState;
import fsm.Machine;
import fsm.State;
import fsm.Transition;

public interface FsmRevisitor<M, S, T, I extends S, F extends S> {
	M machine(Machine it);
	S state(State it);
	T transition(Transition it);
	I initialState(InitialState it);
	F finalState(FinalState it);

	default S $(State it) {
		if (it instanceof InitialState)
			return initialState((InitialState) it);
		if (it instanceof FinalState)
			return finalState((FinalState) it);
		return state(it);
	}

	default M $(Machine it)      { return machine(it);      }
	default T $(Transition it)   { return transition(it);   }
	default I $(InitialState it) { return initialState(it); }
	default F $(FinalState it)   { return finalState(it);   }
}
