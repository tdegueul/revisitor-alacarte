package l3.main;

import l1.A;
import l1.L1Factory;
import l1.sem.IEvalA;
import l2.C;
import l2.L2Factory;
import l3.BindB;
import l3.L3Factory;
import l3.sem.SemL3;

public class Main {
	public static void main(String[] args) {
		L1Factory l1Fact = L1Factory.eINSTANCE;
		L2Factory l2Fact = L2Factory.eINSTANCE;
		L3Factory l3Fact = L3Factory.eINSTANCE;
		
		A a = l1Fact.createA();
		C c = l2Fact.createC();
		BindB bindB = l3Fact.createBindB();
		bindB.setDelegate(c);
		a.setB(bindB);
		
		IEvalA sem = new SemL3(){}.$(a);
		sem.evalA();
	}
}
