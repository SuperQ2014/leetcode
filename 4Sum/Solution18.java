

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18 {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int len = nums.length;
		if (nums == null || len < 4)
			return result;
		Arrays.sort(nums);
		
		int max = nums[len - 1];
		if (nums[0] * 4 > target || max * 4 < target)
			return result;
		
		for (int i = 0; i < len; i++) {
			int first = nums[i];
			if (i > 0 && first == nums[i - 1])
				continue;
			if (first + max * 3 < target)	//first is too small
				continue;
			if (first * 4 > target)		//first is too big
				break;
			if (first * 4 == target) {		//first is the boundary
				if (i + 3 < len && nums[i + 3] == first)
					result.add(Arrays.asList(first, first, first, first));
				break;
			}
			
			threeSum(nums, target - first, i + 1, len - 1, first, result);
		}
		return result;
	}

	/**
	 * @author skyler tao
	 * @param nums: the input array
	 * @param target: three sum target
	 * @param low: the left index
	 * @param high: the right index
	 * @param first: the number from fourSum
	 * @param result: the fourSum result
	 */
	private void threeSum(int[] nums, int target, int low, int high,
			int first, List<List<Integer>> result) {
		
//		int len = high - low + 1;	//error
		for (int i = low; i < high - 1; i++) {
			
			if (i > low && nums[i] == nums[i - 1])
				continue;
			
			int twoTarget = target - nums[i];
			int j = i + 1;
			int k = high;
			while (j < k) {
				if (nums[j] + nums[k] == twoTarget) {
					result.add(Arrays.asList(first,nums[i], nums[j], nums[k]));
					while (j < k && nums[j] == nums[j + 1]) j++;
					while (j < k && nums[k] == nums[k - 1]) k--;
					j++;
					k--;
				} else if (nums[j] + nums[k] < twoTarget) {
					j++;
				} else {
					k--;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Solution18 mySolution = new Solution18();
		int[] nums = {-1,0,1,2,-1,-4};
		int target = -1;
		List<List<Integer>> result = mySolution.fourSum(nums, target);
		for (List<Integer> list : result) {
			for (int k : list)
				System.out.print(k + " ");
			System.out.println("");
		}
	}
}
