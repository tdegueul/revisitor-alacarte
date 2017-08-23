package augmentedfsm.sem.eval;

import augmentedfsm.ExecutableState;
import augmentedfsm.GuardedTransition;
import augmentedfsm.revisitor.AugmentedFsmRevisitor;
import boolexp.sem.eval.EvalBoolExp;
import fsm.sem.eval.EvalFsm;
import simpleimp.Condition;
import simpleimp.sem.eval.EvalSimpleImp;

public interface EvalAugmentedFsm
  extends AugmentedFsmRevisitor<fsm.sem.eval.IStepState, fsm.sem.eval.IFireTransition, fsm.sem.eval.IExecMachine, fsm.sem.eval.IStepState, fsm.sem.eval.IFireTransition, fsm.sem.eval.IStepState, fsm.sem.eval.IStepState, simpleimp.sem.eval.IVoidEval, simpleimp.sem.eval.IVoidEval, simpleimp.sem.eval.IVoidEval, simpleimp.sem.eval.IVoidEval, simpleimp.sem.eval.IBoolEval, boolexp.sem.eval.IEval>,
          EvalFsm,
          EvalSimpleImp,
          EvalBoolExp {

	@Override
	default fsm.sem.eval.IStepState executableState(ExecutableState it) {
		return (evt, ctx) -> {
			$(it.getBody()).eval();
			EvalFsm.super.state(it).step(evt, ctx);
		};
	}

	@Override
	default fsm.sem.eval.IFireTransition guardedTransition(GuardedTransition it) {
		return (ctx) -> {
			if ($(it.getGuard()).eval())
				EvalFsm.super.transition(it).fire(ctx);
		};
	}

	@Override
	default simpleimp.sem.eval.IBoolEval condition(Condition it) {
		return () -> false;
	}

}
