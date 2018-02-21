package basicfsm.sem.eval;

import java.util.Optional;

import basicfsm.InitialState;
import basicfsm.Machine;
import basicfsm.State;
import basicfsm.Trans;
import basicfsm.VarDecl;
import basicfsm.revisitor.BasicFsmRv;

public interface EvalBasicFsm
  extends BasicFsmRv<IExecMachine, IStepState, IFireTransition, IStepState, IRunAction, IEvalGuard, IEvalVarDecl> {
	@Override
	default IExecMachine machine(Machine it) {
		return (events, ctx) -> {
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
		return (event, ctx) -> {
			ctx.visit(it);
			
			it.getDecls().forEach(v -> $(v).eval(ctx));

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
		return (ctx) -> {
			if (!$(it.getGuard()).eval(ctx))
				throw new RuntimeException("Unsatisfied guard for " + it);
			
			$(it.getAction()).run(ctx);
			
			ctx.setCurrent(it.getTgt());
		};
	}
	
	@Override
	default IStepState initialState(InitialState it) {
		return state(it);
	}
	
	@Override
	default IEvalVarDecl varDecl(VarDecl it) {
		return (ctx) -> ctx.bind(it.getName(), it.getValue());
	}
	
	// No eval semantics for Guard & Action
}
