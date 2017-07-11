package boolexpimp.main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import boolexpimp.BoolexpimpPackage;
import boolexpimp.sem.eval.EvalBoolExpImp;
import boolexpimp.sem.print.PrintBoolExpImp;
import ifstatement.IfstatementPackage;
import simpleimp.Block;
import simpleimp.sem.eval.IVoidEval;
import simpleimp.sem.print.IPrint;
import sleepstatement.SleepstatementPackage;

public class Main {
	public static void main(String[] args) {
		Block b = loadModel("Pgm.boolexpimp");

		PrintBoolExpImp pb = new PrintBoolExpImp(){};
		EvalBoolExpImp eb = new EvalBoolExpImp(){};

		IPrint p = pb.$(b);
		IVoidEval e = eb.$(b);

		System.out.println(p.print());
		e.eval();
	}

	public static Block loadModel(String name) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
			.put("boolexpimp", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(IfstatementPackage.eNS_URI, IfstatementPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(SleepstatementPackage.eNS_URI, SleepstatementPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(BoolexpimpPackage.eNS_URI, BoolexpimpPackage.eINSTANCE);
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI(name), true);
		return (Block) res.getContents().get(0);
	}
}
