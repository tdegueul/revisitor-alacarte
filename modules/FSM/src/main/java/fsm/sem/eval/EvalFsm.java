package fsm.sem.eval;

import java.util.Optional;

import fsm.FinalState;
import fsm.InitialState;
import fsm.Machine;
import fsm.State;
import fsm.Transition;
import fsm.revisitor.FsmRevisitor;

public interface EvalFsm
  extends FsmRevisitor<IExecMachine, IStepState, IFireTransition, IStepState, IStepState> {
	@Override
	default IExecMachine machine(Machine it) {
		return (String[] events, Context ctx) -> {
			Optional<State> initial =
				it.getStates().stream()
				.filter(InitialState.class::isInstance)
				.findFirst();

			if (!initial.isPresent())
				throw new RuntimeException("No initial state");

			ctx.setCurrent(initial.get());
			for (String e : events)
				$(ctx.getCurrent()).step(e, ctx);
		};
	}
	
	@Override
	default IStepState state(State it) {
		return (String event, Context ctx) -> {
			ctx.visit(it);

			Optional<Transition> next =
				it.getOutgoing().stream()
				.filter(t -> event.equals(t.getEvent()))
				.findFirst();

			if (!next.isPresent())
				throw new RuntimeException("Locked in " + it.getName() + " with " + event);

			$(next.get()).fire(ctx);
		};
	}
	
	@Override
	default IFireTransition transition(Transition it) {
		return (Context ctx) -> {
			ctx.setCurrent(it.getTarget());
		};
	}
	
	@Override
	default IStepState initialState(InitialState it) {
		return state(it);
	}
	
	@Override
	default IStepState finalState(FinalState it) {
		return (String event, Context ctx) -> {
			throw new RuntimeException("Stepping on a FinalState");
		};
	}
}
