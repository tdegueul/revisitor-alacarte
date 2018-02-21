package fullfsm.revisitor;

import basicfsm.Action;
import basicfsm.Guard;
import basicfsm.revisitor.BasicFsmRv;
import boolexp.revisitor.BoolExpRv;
import fullfsm.BindAction;
import fullfsm.BindGuard;
import simpleal.revisitor.SimpleALRv;

public interface FullFsmRv<M, S, T, I extends S, A, G, E, B, ST, P extends ST, BA extends A, BG extends G>
	extends BasicFsmRv<M, S, T, I, A, G>, BoolExpRv<E>, SimpleALRv<B, ST, P> {
	
	BA bindAction(BindAction it);
	BG bindGuard(BindGuard it);
	
	@Override
	default A $(Action it) {
		return $((BindAction) it);
	}
	
	@Override
	default G $(Guard it) {
		return $((BindGuard) it);
	}
	
	default BA $(BindAction it) {
		return bindAction(it);
	}
	
	default BG $(BindGuard it) {
		return bindGuard(it);
	}
	
}
