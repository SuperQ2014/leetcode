package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution290 {

	public boolean wordPattern(String pattern, String str) {
		
		String[] strs = str.split(" ");
		char[] patterns = pattern.toCharArray();
		int n = strs.length;
		if (n != patterns.length)
			return false;
		
		Map<Character, String> pattern_str = new HashMap<Character, String>();
		Map<String, Character> str_pattern = new HashMap<String, Character>();
		for (int i = 0; i < n; i++) {
			if (!pattern_str.containsKey(patterns[i])) {
				pattern_str.put(patterns[i], strs[i]);
			} else {
				String v1 = pattern_str.get(patterns[i]);
				String v2 = strs[i];
				if (!v1.equals(v2))
					return false;
			}
		}
		for (int i = 0; i < n; i++) {
			if (!str_pattern.containsKey(strs[i])) {
				str_pattern.put(strs[i], patterns[i]);
			} else {
				Character v1 = str_pattern.get(strs[i]);
				Character v2 = patterns[i];
				if (!v1.equals(v2))
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Solution290 mySolution = new Solution290();
		boolean result = mySolution.wordPattern("abba", "dog dog dog dog");
		System.out.println(result);
	}
}
