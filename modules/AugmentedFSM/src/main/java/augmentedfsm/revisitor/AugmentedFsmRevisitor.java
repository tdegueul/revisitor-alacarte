package augmentedfsm.revisitor;

import augmentedfsm.ExecutableState;
import augmentedfsm.GuardedTransition;
import boolexp.revisitor.BoolExpRevisitor;
import fsm.FinalState;
import fsm.InitialState;
import fsm.State;
import fsm.Transition;
import fsm.revisitor.FsmRevisitor;
import simpleimp.revisitor.SimpleImpRevisitor;

public interface AugmentedFsmRevisitor<ES extends S, GT extends T, M, S, T, I extends S, F extends S, ST, B extends ST, W extends ST, P extends ST, C, E>
  extends FsmRevisitor<M, S, T, I, F>,
          SimpleImpRevisitor<ST, B, W, P, C>,
          BoolExpRevisitor<E>  {

	ES executableState(ExecutableState it);
	GT guardedTransition(GuardedTransition it);

	@Override
	default S $(State it) {
		if (it instanceof InitialState)
			return initialState((InitialState) it);
		if (it instanceof FinalState)
			return finalState((FinalState) it);
		if (it instanceof ExecutableState)
			return executableState((ExecutableState) it);
		return state(it);
	}

	@Override
	default T $(Transition it) {
		if (it instanceof GuardedTransition)
			return guardedTransition((GuardedTransition) it);
		return transition(it);
	}

	default ES $(ExecutableState it)   { return executableState(it);   }
	default GT $(GuardedTransition it) { return guardedTransition(it); }
}
