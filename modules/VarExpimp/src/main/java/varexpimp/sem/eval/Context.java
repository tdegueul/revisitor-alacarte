package varexpimp.sem.eval;

import java.util.HashMap;
import java.util.Map;

public class Context {
	private Map<String, Boolean> vars = new HashMap<>();
	
	public boolean get(String n) {
		return vars.get(n);
	}
	public void bind(String n, boolean v) {
		vars.put(n, v);
	}
}
