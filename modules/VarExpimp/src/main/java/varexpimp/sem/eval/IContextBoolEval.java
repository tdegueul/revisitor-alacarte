package varexpimp.sem.eval;

public interface IContextBoolEval extends boolexp.sem.eval.IEval, simpleimp.sem.eval.IBoolEval {
	boolean eval(Context ctx);
}
