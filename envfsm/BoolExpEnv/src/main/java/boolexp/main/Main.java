package boolexp.main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import boolexp.And;
import boolexp.BoolexpFactory;
import boolexp.BoolexpPackage;
import boolexp.Exp;
import boolexp.Not;
import boolexp.Or;
import boolexp.VarRef;
import boolexp.sem.eval.Env;
import boolexp.sem.eval.EvalBoolExp;
import boolexp.sem.eval.IEval;
import boolexp.sem.print.IPrint;
import boolexp.sem.print.PrintBoolExp;

public class Main {
	public static void main(String[] args) {
		Exp m1 = loadModel("True.boolexp");
		Exp m2 = loadModel("False.boolexp");
		Exp m3 = createEnvModel();
		Env env1 = new Env();
		Env env2 = new Env();
		Env env3 = new Env();
		env3.bind("a",  true);
		env3.bind("b",  false);

		PrintBoolExp pe = new PrintBoolExp(){};
		EvalBoolExp ee = new EvalBoolExp(){};

		IPrint p1 = pe.$(m1);
		IEval e1 = ee.$(m1);

		IPrint p2 = pe.$(m2);
		IEval e2 = ee.$(m2);
		
		IPrint p3 = pe.$(m3);
		IEval e3 = ee.$(m3);

		System.out.println(p1.print() + " = " + e1.eval(env1));
		System.out.println(p2.print() + " = " + e2.eval(env2));
		System.out.println(p3.print() + " = " + e3.eval(env3));
	}

	public static Exp loadModel(String name) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
			.put("boolexp",	new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(BoolexpPackage.eNS_URI, BoolexpPackage.eINSTANCE);
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI(name), true);
		return (Exp) res.getContents().get(0);
	}
	
	public static Exp createEnvModel() {
		// (a && b) || !a
		BoolexpFactory fact = BoolexpFactory.eINSTANCE;
		
		Or or = fact.createOr();
		And and = fact.createAnd();
		Not not = fact.createNot();
		
		VarRef a1 = fact.createVarRef();
		a1.setName("a");
		
		VarRef a2 = fact.createVarRef();
		a2.setName("a");
		
		VarRef b = fact.createVarRef();
		b.setName("b");
		
		not.setExp(a2);
		
		and.setLhs(a1);
		and.setRhs(b);
		
		or.setLhs(and);
		or.setRhs(not);
		
		return or;
	}
}
