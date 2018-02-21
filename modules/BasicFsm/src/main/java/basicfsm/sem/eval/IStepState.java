package basicfsm.sem.eval;

public interface IStepState {
	void step(String event, Context ctx);
}
