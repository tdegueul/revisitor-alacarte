package fullfsm.revisitor;

import basicfsm.Action;
import basicfsm.Guard;
import basicfsm.revisitor.BasicFsmRv;
import boolexp.revisitor.BoolExpRv;
import fullfsm.BindAction;
import fullfsm.BindGuard;
import simpleal.revisitor.SimpleALRv;

/**
 * FullFsm = BasicFsm + BoolExp + SimpleAL
 * 
 * with bindings
 * 		basicfsm.Action -> (fullfsm.BindAction) -> simpleal.Block
 * 		basicfsm.Guard  -> (fullfsm.BindGuard)  -> boolexp.Exp 
 */
public interface FullFsmRv
	<
		M, S, T, I extends S, A, G,                      // From BasicFsm
		E,                                               // From BoolExp
		B, ST, P extends ST,                             // From SimpleAL
		BA extends A, BG extends G                       // Bindings
	>
	extends
		BasicFsmRv<M, S, T, I, A, G>,
		BoolExpRv<E>,
		SimpleALRv<B, ST, P>
{
	BA bindAction(BindAction it);
	BG bindGuard(BindGuard it);
	
	@Override
	default A $(Action it) {
		// We know every Action is a BindAction in the resulting language
		return $((BindAction) it);
	}
	
	@Override
	default G $(Guard it) {
		// We know every Guard is a BindGuard in the resulting language
		return $((BindGuard) it);
	}
	
	default BA $(BindAction it) {
		return bindAction(it);
	}
	
	default BG $(BindGuard it) {
		return bindGuard(it);
	}
}
