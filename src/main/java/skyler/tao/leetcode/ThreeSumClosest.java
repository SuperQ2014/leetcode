package skyler.tao.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {

	public int threeSum(int[] nums, int target) {

		if (nums == null || nums.length < 3) return (Integer)null;
		int len = nums.length;
		
		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[len - 1];
		int sum = 0;
		
		for (int i = 0; i < len - 2; i++) {
			
			if(i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int start = i + 1; int end = len - 1;
			while (start < end) {
				sum = nums[i] + nums[start] + nums[end];
				if (sum > target) {
					while (start < end && nums[end] == nums[end - 1]) end--;
					end--;
				} else if (sum < target){
					while (start < end && nums[start] == nums[start + 1]) start++;
					start++;
				} else {
					return sum;
				}
				if (Math.abs(sum - target) < Math.abs(result - target)) {
					result = sum;
				}
			}
		}
		return result;
	}
}
