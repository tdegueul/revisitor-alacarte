package fullfsm.main;

import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import basicfsm.BasicfsmFactory;
import basicfsm.Machine;
import basicfsm.State;
import basicfsm.Trans;
import basicfsm.VarDecl;
import basicfsm.sem.eval.Context;
import boolexp.BoolexpFactory;
import boolexp.Exp;
import boolexp.Or;
import boolexp.VarRef;
import fullfsm.BindAction;
import fullfsm.BindGuard;
import fullfsm.FullfsmFactory;
import fullfsm.FullfsmPackage;
import fullfsm.sem.eval.EvalFullFsm;
import fullfsm.sem.print.PrintFullFsm;
import simpleal.ArithLit;
import simpleal.ArithPlus;
import simpleal.Assign;
import simpleal.Block;
import simpleal.Print;
import simpleal.SimplealFactory;

public class Main {
	public static void main(String[] args) {
//		Machine m = createModel();
		Machine m = loadArithModel();
		PrintFullFsm printSem = new PrintFullFsm(){};
		EvalFullFsm evalSem = new EvalFullFsm(){};
		
		System.out.println("Print:");
		System.out.println(printSem.$(m).print());
		
		System.out.println("Eval:");
		Context ctx = new Context();
		ctx.bind("x", true);
		ctx.bind("y", true);
		ctx.bind("i", 0);
		ctx.bind("j", 0);
		String[] events = {"a", "b", "a", "b", "a", "b", "a", "b", "a", "c", "b", "a", "b"};
		evalSem.$(m).exec(events, ctx);
		System.out.println("Trace: " +
				ctx.getTrace().stream()
				.map(s -> s.getName())
				.collect(Collectors.joining(" -> ")));
	}
	
	public static Machine loadArithModel() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"fullfsm", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(
				FullfsmPackage.eNS_URI, FullfsmPackage.eINSTANCE);
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI("../Models/Arith.fullfsm"), true);
		return (Machine) res.getContents().get(0);
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
		
		VarDecl v = bfsmFact.createVarDecl();
		v.setName("j");
		v.setValue(1);
		
		s1.getDecls().add(v);
		
		Trans t1 = bfsmFact.createTrans();
		t1.setEvent('a');
		Trans t2 = bfsmFact.createTrans();
		t2.setEvent('b');
		Trans t3 = bfsmFact.createTrans();
		t3.setEvent('c');
		
		t1.setSrc(s1);
		t1.setTgt(s2);
		t2.setSrc(s2);
		t2.setTgt(s1);
		t3.setSrc(s2);
		t3.setTgt(s2);
		
		Or e1 = expFact.createOr();
		VarRef r1 = expFact.createVarRef();
		r1.setName("x");
		e1.setLhs(r1);
		e1.setRhs(expFact.createTru());
		
		Or e2 = expFact.createOr();
		VarRef r2 = expFact.createVarRef();
		r2.setName("y");
		e2.setLhs(r2);
		e2.setRhs(expFact.createFals());
		
		Exp e3 = expFact.createTru();
		
		BindGuard bg1 = ffsmFact.createBindGuard();
		bg1.setDelegate(e1);
		BindGuard bg2 = ffsmFact.createBindGuard();
		bg2.setDelegate(e2);
		BindGuard bg3 = ffsmFact.createBindGuard();
		bg3.setDelegate(e3);
		
		Block b1 = alFact.createBlock();
		Print p1 = alFact.createPrint();
		p1.setName("i");
		b1.getStmts().add(p1);
		
		Block b2 = alFact.createBlock();
		Print p2 = alFact.createPrint();
		p2.setName("j");
		b2.getStmts().add(p2);
		
		Block b3 = alFact.createBlock();
		Assign bi = alFact.createAssign();
		simpleal.VarRef vr = alFact.createVarRef();
		vr.setName("i");
		ArithPlus ap = alFact.createArithPlus();
		ArithLit al = alFact.createArithLit();
		al.setVal(1);
		ap.setLhs(vr);
		ap.setRhs(al);
		bi.setName("i");
		bi.setVal(ap);
		b3.getStmts().add(bi);
		
		BindAction ba1 = ffsmFact.createBindAction();
		ba1.setDelegate(b1);
		BindAction ba2 = ffsmFact.createBindAction();
		ba2.setDelegate(b2);
		BindAction ba3 = ffsmFact.createBindAction();
		ba3.setDelegate(b3);
		
		t1.setGuard(bg1);
		t1.setAction(ba1);
		t2.setGuard(bg2);
		t2.setAction(ba2);
		t3.setGuard(bg3);
		t3.setAction(ba3);
		
		m.getStates().add(s1);
		m.getStates().add(s2);
		m.getTrans().add(t1);
		m.getTrans().add(t2);
		m.getTrans().add(t3);
		
		return m;
	}
}
