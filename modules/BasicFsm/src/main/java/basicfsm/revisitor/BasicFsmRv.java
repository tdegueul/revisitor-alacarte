package basicfsm.revisitor;

import basicfsm.Action;
import basicfsm.Guard;
import basicfsm.InitialState;
import basicfsm.Machine;
import basicfsm.State;
import basicfsm.Trans;

public interface BasicFsmRv<M, S, T, I extends S, A, G> {
	M machine(Machine it);
	S state(State it);
	T trans(Trans it);
	I initialState(InitialState it);
	
	A $(Action it); // No concrete type to bind to
	G $(Guard it);  // No concrete type to bind to

	default M $(Machine it) { return machine(it); }
	default T $(Trans it) { return trans(it); }
	default I $(InitialState it) { return initialState(it); }
	default S $(State it) {
		if (it instanceof InitialState)
			return initialState((InitialState) it);
		return state(it);
	}
}
