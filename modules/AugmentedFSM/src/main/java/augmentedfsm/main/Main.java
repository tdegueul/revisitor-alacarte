package augmentedfsm.main;

import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import augmentedfsm.AugmentedfsmPackage;
import augmentedfsm.sem.eval.EvalAugmentedFsm;
import augmentedfsm.sem.print.PrintAugmentedFsm;
import boolexp.BoolexpPackage;
import fsm.FsmPackage;
import fsm.Machine;
import fsm.sem.eval.Context;
import fsm.sem.eval.IExecMachine;
import fsm.sem.print.IPrint;
import simpleimp.SimpleimpPackage;

public class Main {
	public static void main(String[] args) {
		Machine m = loadModel("Turnstile.augmentedfsm");

		PrintAugmentedFsm pf = new PrintAugmentedFsm(){};
		EvalAugmentedFsm ef = new EvalAugmentedFsm(){};

		IPrint p = pf.$(m);
		IExecMachine e = ef.$(m);
		Context ctx = new Context();

		System.out.println(p.print());

		String[] events = {"push", "coin", "coin", "push", "push", "coin", "push"};
		e.exec(events, ctx);
		System.out.println("Trace: " +
				ctx.getTrace().stream()
				.map(s -> s.getName())
				.collect(Collectors.joining(" -> ")));
	}

	public static Machine loadModel(String name) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
			.put("augmentedfsm", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(FsmPackage.eNS_URI, FsmPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(AugmentedfsmPackage.eNS_URI, AugmentedfsmPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(BoolexpPackage.eNS_URI, BoolexpPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(SimpleimpPackage.eNS_URI, SimpleimpPackage.eINSTANCE);
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI(name), true);
		return (Machine) res.getContents().get(0);
	}
}
