import java.util.HashMap;
import java.util.Map;

public class Solution1 {

	public int[] twoSum(int[] nums, int target) {

		int[] result = new int[2];
		if (nums == null || nums.length < 2)
			return result;
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (myMap.containsKey(target - nums[i])) {
				result[0] = myMap.get(target - nums[i]);
				result[1] = i;
				break;
			} else {
				myMap.put(nums[i], i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Solution1 mySolution = new Solution1();
		int[] nums = {1,2,3,4,5,6};
		int target = 9;
		int[] result = mySolution.twoSum(nums, target);
		System.out.println(result[0] + " " + result[1]);
	}
}
