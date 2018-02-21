package basicfsm.sem.eval;

import java.util.Optional;

import basicfsm.InitialState;
import basicfsm.Machine;
import basicfsm.State;
import basicfsm.Trans;
import basicfsm.revisitor.BasicFsmRv;

public interface EvalFsm
  extends BasicFsmRv<IExecMachine, IStepState, IFireTransition, IStepState, IRunAction, IEvalGuard> {
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

			Optional<Trans> next =
				it.getOut().stream()
				.filter(t -> event.equals(Character.toString(t.getEvent())))
				.findFirst();

			if (!next.isPresent())
				throw new RuntimeException("Locked in " + it.getName() + " with " + event);

			$(next.get()).fire(ctx);
		};
	}
	
	@Override
	default IFireTransition trans(Trans it) {
		return (Context ctx) -> {
			if (!$(it.getGuard()).eval())
				throw new RuntimeException("Unsatisfied guard for " + it);

			$(it.getAction()).run();

			ctx.setCurrent(it.getTgt());
		};
	}
	
	@Override
	default IStepState initialState(InitialState it) {
		return state(it);
	}
	
	// No eval semantics for Guard & Action
}
