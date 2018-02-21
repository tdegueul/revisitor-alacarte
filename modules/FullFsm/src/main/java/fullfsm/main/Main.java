package fullfsm.main;

import basicfsm.BasicfsmFactory;
import basicfsm.Machine;
import basicfsm.State;
import basicfsm.Trans;
import boolexp.BoolexpFactory;
import boolexp.Exp;
import fullfsm.BindAction;
import fullfsm.BindGuard;
import fullfsm.FullfsmFactory;
import fullfsm.sem.print.PrintFullFsm;
import simpleal.Block;
import simpleal.Print;
import simpleal.SimplealFactory;

public class Main {
	public static void main(String[] args) {
		Machine m = createModel();
		PrintFullFsm printSem = new PrintFullFsm(){};
		
		System.out.println(printSem.$(m).print());
	}
	
	public static Machine createModel() {
		FullfsmFactory ffsmFact = FullfsmFactory.eINSTANCE;
		BasicfsmFactory bfsmFact = BasicfsmFactory.eINSTANCE;
		BoolexpFactory expFact = BoolexpFactory.eINSTANCE;
		SimplealFactory alFact = SimplealFactory.eINSTANCE;
		
		Machine m = bfsmFact.createMachine();
		m.setName("Dummy");
		
		State s1 = bfsmFact.createInitialState();
		s1.setName("s1");
		State s2 = bfsmFact.createState();
		s2.setName("s2");
		
		Trans t1 = bfsmFact.createTrans();
		t1.setEvent('a');
		Trans t2 = bfsmFact.createTrans();
		t2.setEvent('b');
		
		t1.setSrc(s1);
		t1.setTgt(s2);
		t2.setSrc(s2);
		t2.setTgt(s1);
		
		Exp e1 = expFact.createTru();
		Exp e2 = expFact.createTru();
		
		BindGuard bg1 = ffsmFact.createBindGuard();
		bg1.setBound(e1);
		BindGuard bg2 = ffsmFact.createBindGuard();
		bg2.setBound(e2);
		
		Block b1 = alFact.createBlock();
		Print p1 = alFact.createPrint();
		p1.setMsg("1 -> 2");
		b1.getStmts().add(p1);
		
		Block b2 = alFact.createBlock();
		Print p2 = alFact.createPrint();
		p2.setMsg("2 -> 1");
		b2.getStmts().add(p2);
		
		BindAction ba1 = ffsmFact.createBindAction();
		ba1.setBound(b1);
		BindAction ba2 = ffsmFact.createBindAction();
		ba2.setBound(b2);
		
		t1.setGuard(bg1);
		t2.setGuard(bg2);
		t1.setAction(ba1);
		t2.setAction(ba2);
		
		m.getStates().add(s1);
		m.getStates().add(s2);
		m.getTrans().add(t1);
		m.getTrans().add(t2);
		
		return m;
	}
}