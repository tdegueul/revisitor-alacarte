package varexpimp.sem.print;

import boolexp.And;
import boolexp.Exp;
import boolexp.Fals;
import boolexp.Lit;
import boolexp.Or;
import boolexp.Tru;
import boolexpimp.sem.print.PrintBoolExpImp;
import ifstatement.If;
import simpleimp.Block;
import simpleimp.Print;
import simpleimp.Statement;
import simpleimp.Whil;
import sleepstatement.Sleep;
import varexpimp.VarDecl;
import varexpimp.VarRef;
import varexpimp.revisitor.VarExpImpRevisitor;

public interface PrintVarExpImp
  extends VarExpImpRevisitor<boolexp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, simpleimp.sem.print.IPrint, boolexp.sem.print.IPrint>,
          PrintBoolExpImp {

	@Override
	default simpleimp.sem.print.IPrint $(Statement it) {
		if (it instanceof Block)
			return block((Block) it);
		if (it instanceof Whil)
			return whil((Whil) it);
		if (it instanceof Print)
			return print((Print) it);
		if (it instanceof Sleep)
			return sleep((Sleep) it);
		if (it instanceof If)
			return iff((If) it);
		return varDecl((VarDecl) it);
	}

	@Override
	default boolexp.sem.print.IPrint $(Exp it) {
		if (it instanceof Tru)
			return tru((Tru) it);
		if (it instanceof Fals)
			return fals((Fals) it);
		if (it instanceof And)
			return and((And) it);
		if (it instanceof Or)
			return or((Or) it);
		return varRef((VarRef) it);
	}

	@Override
	default boolexp.sem.print.IPrint $(Lit it) {
		if (it instanceof Tru)
			return tru((Tru) it);
		if (it instanceof Fals)
			return fals((Fals) it);
		return varRef((VarRef) it);
	}
	
	@Override
	default simpleimp.sem.print.IPrint varDecl(VarDecl it) {
		return () -> "var " + it.getName() + " := " + $(it.getValue()).print();
	}
	
	@Override
	default boolexp.sem.print.IPrint varRef(VarRef it) {
		return () -> it.getName();
	}

}
