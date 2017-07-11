package varexpimp.revisitor;

import boolexp.Exp;
import boolexp.Lit;
import simpleimp.Statement;
import varexpimp.VarDecl;
import varexpimp.VarRef;

public interface VarExpImpRevisitor<E, S, B extends S, W extends S, P extends S, SL extends S, I extends S, BEC extends C, C, VD extends S, VR extends E>
  {//extends BoolExpImpRevisitor<E, S, B, W, P, SL, I, BEC, C> {
	VD varDecl(VarDecl it);
	VR varRef(VarRef it);

//	@Override
	default S $(Statement it) {
//		if (it instanceof VarDecl)
			return varDecl((VarDecl) it);
//		return BoolExpImpRevisitor.super.$(it);
	}
	
//	@Override
	default E $(Exp it) {
//		if (it instanceof VarRef)
			return varRef((VarRef) it);
//		return BoolExpImpRevisitor.super.$(it);
	}
	
//	@Override
	default E $(Lit it) {
//		if (it instanceof VarRef)
			return varRef((VarRef) it);
//		return BoolExpImpRevisitor.super.$(it);
	}

	default VD $(VarDecl it) { return varDecl(it); }
	default VR $(VarRef  it) { return varRef(it);  }
}
