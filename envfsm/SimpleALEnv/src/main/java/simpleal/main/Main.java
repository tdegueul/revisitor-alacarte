package simpleal.main;

import simpleal.Bind;
import simpleal.Block;
import simpleal.Print;
import simpleal.PrintVar;
import simpleal.SimplealFactory;
import simpleal.sem.eval.Env;
import simpleal.sem.eval.EvalSimpleAL;
import simpleal.sem.print.PrintSimpleAL;

public class Main {
	public static void main(String[] args) {
		Block pgm = createProgram();
		PrintSimpleAL printSem = new PrintSimpleAL(){};
		EvalSimpleAL evalSem = new EvalSimpleAL(){};
		Env env = new Env();
		env.bind("a", "foo");

		System.out.println("Print:");
		System.out.println(printSem.$(pgm).print());
		
		System.out.println();
		System.out.println("Eval:");
		evalSem.$(pgm).eval(env);
	}
	
	public static Block createProgram() {
		SimplealFactory fact = SimplealFactory.eINSTANCE;
		Block b = fact.createBlock();
		
		Print p = fact.createPrint();
		p.setMsg("Printing a");
		
		PrintVar pv1 = fact.createPrintVar();
		pv1.setVarName("a");
		
		Bind bi = fact.createBind();
		bi.setName("a");
		bi.setVal("bar");
		
		PrintVar pv2 = fact.createPrintVar();
		pv2.setVarName("a");
		
		b.getStmts().add(p);
		b.getStmts().add(pv1);
		b.getStmts().add(bi);
		b.getStmts().add(pv2);
		
		return b;
	}
}
