package simpleal.sem.eval;

import java.util.HashMap;
import java.util.Map;

public class Env {
	Map<String, String> env = new HashMap<>();

	public void bind(String s, String v) {
		env.put(s, v);
	}
	
	public String get(String s) {
		return env.get(s);
	}
	
	public Map<String, String> getEnv() {
		return env;
	}
}
