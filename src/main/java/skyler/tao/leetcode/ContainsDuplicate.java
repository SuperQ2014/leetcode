package skyler.tao.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			if (!set.contains(i)) {
				set.add(i);
			} else {
				return true;
			}
		}
		return false;
	}
}
