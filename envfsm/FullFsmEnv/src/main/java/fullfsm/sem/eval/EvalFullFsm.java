package fullfsm.sem.eval;

import basicfsm.sem.eval.EvalBasicFsm;
import basicfsm.sem.eval.IEvalGuard;
import basicfsm.sem.eval.IEvalVarDecl;
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
			IExecMachine, IStepState, IFireTransition, IStepState, IRunAction, IEvalGuard, IEvalVarDecl,
			boolexp.sem.eval.IEval,
			simpleal.sem.eval.IVoidEval, simpleal.sem.eval.IVoidEval, simpleal.sem.eval.IIntEval, simpleal.sem.eval.IIntEval, simpleal.sem.eval.IIntEval, simpleal.sem.eval.IIntEval, simpleal.sem.eval.IIntEval, simpleal.sem.eval.IIntEval, simpleal.sem.eval.IVoidEval, simpleal.sem.eval.IVoidEval,
			IRunAction, IEvalGuard
		>,
		EvalBasicFsm,
		EvalBoolExp,
		EvalSimpleAL
{
	@Override
	default IRunAction bindAction(BindAction it) {
		return (ctx) -> {
			// Passing environment
			simpleal.sem.eval.Env env = new simpleal.sem.eval.Env();
			ctx.getEnv()
				.forEach((k, v) -> {
					if (v instanceof Integer)
						env.bind(k, (Integer) v);
				});
			
			$(it.getDelegate()).eval(env);
			
			// And then translate back
			env.getEnv().forEach((k, v) -> {
				ctx.bind(k, v);
			});
		};
	}
	
	@Override
	default IEvalGuard bindGuard(BindGuard it) {
		return (ctx) -> {
			boolexp.sem.eval.Env env = new boolexp.sem.eval.Env();
			ctx.getEnv()
				.forEach((k, v) -> {
					if (v instanceof Boolean)
						env.bind(k, (Boolean) v);
				});
			
			return $(it.getDelegate()).eval(env);
		};
	}
}
