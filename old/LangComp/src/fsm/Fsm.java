package fsm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fsm {
	// FSM "metamodel"
	static class Machine {
		List<State> states = new ArrayList<>();
		public Machine(List<State> l) { states = l; }
	}
	static class State {
		Machine owning;
		String name;
		List<Trans> out = new ArrayList<>();
		public State(String n) { name = n; }
	}
	static class Trans {
		String event;
		State src;
		State tgt;
		public Trans(String e, State s, State t) { event = e; src = s; tgt = t; }
	}
	static class Initial extends State {
		public Initial(String n) { super(n); }
	}
	static class Final extends State {
		public Final(String n) { super(n); }
	}
	
	// FSM Revisitor
	interface FsmAlg<M, S, T, I extends S, F extends S> {
		M machine(Machine it);
		S state(State it);
		T trans(Trans it);
		I initial(Initial it);
		F finall(Final it);
		
		default M $(Machine it) { return machine(it); }
		default T $(Trans it)   { return trans(it); }
		default I $(Initial it) { return initial(it); }
		default F $(Final it)   { return finall(it); }
		default S $(State it) {
			if (it instanceof Initial)
				return initial((Initial) it);
			if (it instanceof Final)
				return finall((Final) it);
			return state(it);
		}
	}
	
	// Printing FSMs
	interface IPrint { String print(); }
	interface PrintFsm extends FsmAlg<IPrint, IPrint, IPrint, IPrint, IPrint> {
		@Override default IPrint machine(Machine it) {
			return () ->
				"Machine:\n########\n" +
				it.states.stream()
				.map(s -> $(s).print())
				.collect(Collectors.joining("\n"));
		}
		@Override default IPrint state(State it) {
			return () ->
				"State " + it.name + "\n\t" +
					it.out.stream()
					.map(t -> $(t).print())
					.collect(Collectors.joining("\n\t"));
		}
		@Override default IPrint trans(Trans it) {
			return () -> "(" + it.event + ") -> " + it.tgt.name;
		}
		@Override default IPrint initial(Initial it) {
			return () -> "[I] " + state(it).print();
		}
		@Override default IPrint finall(Final it) {
			return () -> "[F] " + state(it).print();
		}
	}
	
	// Evaluating FSMs
	static class RuntimeMachine extends Machine {
		State current;
		public RuntimeMachine(List<State> l) { super(l); }
	}
	interface IExecMachine { void exec(String events); }
	interface IStepState { void step(String event); }
	interface IFireTrans { void fire(); boolean canFire(String event); }
	interface EvalFsm extends FsmAlg<IExecMachine, IStepState, IFireTrans, IStepState, IStepState> {
		@Override default IExecMachine machine(Machine it) {
			return (e) -> {
				String[] events = e.split("");
				
			};
		}
		@Override default IStepState state(State it) {
			return (e) -> {};
		}
		@Override default IFireTrans trans(Trans it) {
			return new IFireTrans() {
				@Override public void fire() {
					// Type groups blablabla
					((RuntimeMachine) it.src.owning).current = it.tgt;
				}
				@Override public boolean canFire(String e) {
					return it.event == e;
				}
			};
		}
		@Override default IStepState initial(Initial it) {
			return state(it);
		}
		@Override default IStepState finall(Final it) {
			return state(it);
		}
	}
	
	public static void main(String[] args) {
		Machine m = makeModel();
		
		IPrint p = new PrintFsm(){}.$(m);
		System.out.println(p.print());
	}
	
	public static Machine makeModel() {
		State s1 = new Initial("Init");
		State s2 = new Final("Final");
		Trans t1 = new Trans("a", s1, s2);
		Trans t2 = new Trans("b", s2, s1);
		s1.out = Arrays.asList(t1);
		s2.out = Arrays.asList(t2);
		Machine m = new Machine(Arrays.asList(s1, s2));
		s1.owning = m;
		s2.owning = m;
		return m;
	}
}
