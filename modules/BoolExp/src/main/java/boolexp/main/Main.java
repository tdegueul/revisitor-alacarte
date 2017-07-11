package boolexp.main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import boolexp.BoolexpPackage;
import boolexp.Exp;
import boolexp.sem.eval.EvalBoolExp;
import boolexp.sem.eval.IEval;
import boolexp.sem.print.IPrint;
import boolexp.sem.print.PrintBoolExp;

public class Main {
	public static void main(String[] args) {
		Exp m1 = loadModel("True.boolexp");
		Exp m2 = loadModel("False.boolexp");

		PrintBoolExp pe = new PrintBoolExp(){};
		EvalBoolExp ee = new EvalBoolExp(){};

		IPrint p1 = pe.$(m1);
		IEval e1 = ee.$(m1);

		IPrint p2 = pe.$(m2);
		IEval e2 = ee.$(m2);

		System.out.println(p1.print() + " = " + e1.eval());
		System.out.println(p2.print() + " = " + e2.eval());
	}

	public static Exp loadModel(String name) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
			.put("boolexp",	new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(BoolexpPackage.eNS_URI, BoolexpPackage.eINSTANCE);
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI(name), true);
		return (Exp) res.getContents().get(0);
	}
}
