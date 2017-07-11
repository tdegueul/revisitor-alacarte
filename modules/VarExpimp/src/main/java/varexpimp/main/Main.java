package varexpimp.main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import boolexpimp.BoolexpimpPackage;
import ifstatement.IfstatementPackage;
import simpleimp.Block;
import simpleimp.sem.print.IPrint;
import sleepstatement.SleepstatementPackage;
import varexpimp.VarexpimpPackage;
import varexpimp.sem.eval.Context;
import varexpimp.sem.eval.EvalVarExpImp;
import varexpimp.sem.eval.IContextVoidEval;
import varexpimp.sem.print.PrintVarExpImp;

public class Main {
	public static void main(String[] args) {
		Block b = loadModel("Pgm.varexpimp");

		PrintVarExpImp pb = new PrintVarExpImp(){};
		EvalVarExpImp eb = new EvalVarExpImp(){};

		IPrint p = pb.$(b);
		IContextVoidEval e = eb.$(b);

		System.out.println(p.print());
		e.eval(new Context());
	}

	public static Block loadModel(String name) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
			.put("varexpimp", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(IfstatementPackage.eNS_URI, IfstatementPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(SleepstatementPackage.eNS_URI, SleepstatementPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(BoolexpimpPackage.eNS_URI, BoolexpimpPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(VarexpimpPackage.eNS_URI, VarexpimpPackage.eINSTANCE);
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI(name), true);
		return (Block) res.getContents().get(0);
	}
}
