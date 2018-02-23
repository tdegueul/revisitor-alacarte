package simpleal.main;

import simpleal.ArithLit;
import simpleal.ArithPlus;
import simpleal.Assign;
import simpleal.Block;
import simpleal.Print;
import simpleal.SimplealFactory;
import simpleal.VarRef;
import simpleal.sem.eval.Env;
import simpleal.sem.eval.EvalSimpleAL;
import simpleal.sem.print.PrintSimpleAL;

public class Main {
	public static void main(String[] args) {
		Block pgm = createProgram();
		PrintSimpleAL printSem = new PrintSimpleAL(){};
		EvalSimpleAL evalSem = new EvalSimpleAL(){};
		Env env = new Env();
		env.bind("i", 1);

		System.out.println("Print:");
		System.out.println(printSem.$(pgm).print());
		
		System.out.println();
		System.out.println("Eval:");
		evalSem.$(pgm).eval(env);
	}
	
	public static Block createProgram() {
		SimplealFactory fact = SimplealFactory.eINSTANCE;
		Block b = fact.createBlock();
		
		Print p1 = fact.createPrint();
		p1.setName("i");
		
		ArithPlus p = fact.createArithPlus();
		VarRef v = fact.createVarRef();
		ArithLit l = fact.createArithLit();

		v.setName("i");
		l.setVal(1);
		p.setLhs(v);
		p.setRhs(l);
		
		Assign a = fact.createAssign();
		a.setName("i");
		a.setVal(p);
		
		Print p2 = fact.createPrint();
		p2.setName("i");
		
		b.getStmts().add(p1);
		b.getStmts().add(a);
		b.getStmts().add(p2);
		
		return b;
	}
}
