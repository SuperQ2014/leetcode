import java.util.HashSet;
import java.util.Set;

public class Solution217 {

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
	
	public static void main(String[] args) {
		Solution217 mySolution = new Solution217();
		int[] nums = {1,2,3,4,1};
		boolean result = mySolution.containsDuplicate(nums);
		System.out.println(result);
	}
}
