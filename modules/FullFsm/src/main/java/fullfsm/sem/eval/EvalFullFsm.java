package fullfsm.sem.eval;

import basicfsm.sem.eval.EvalBasicFsm;
import basicfsm.sem.eval.IEvalGuard;
import basicfsm.sem.eval.IExecMachine;
import basicfsm.sem.eval.IFireTransition;
import basicfsm.sem.eval.IRunAction;
import basicfsm.sem.eval.IStepState;
import boolexp.sem.eval.EvalBoolExp;
import fullfsm.BindAction;
import fullfsm.BindGuard;
import fullfsm.revisitor.FullFsmRv;
import simpleal.sem.eval.EvalSimpleAL;

public interface EvalFullFsm
	extends FullFsmRv
		<
			IExecMachine, IStepState, IFireTransition, IStepState, IRunAction, IEvalGuard,
			boolexp.sem.eval.IEval,
			simpleal.sem.eval.IEval, simpleal.sem.eval.IEval, simpleal.sem.eval.IEval,
			IRunAction, IEvalGuard
		>,
		EvalBasicFsm,
		EvalBoolExp,
		EvalSimpleAL
{
	@Override
	default IRunAction bindAction(BindAction it) {
		return () -> $(it.getDelegate()).eval();
	}
	
	@Override
	default IEvalGuard bindGuard(BindGuard it) {
		return () -> $(it.getDelegate()).eval();
	}
}
