package skyler.tao.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (nums == null || nums.length < 3) {
			return result;
		}
		
		Arrays.sort(nums);
		
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if(nums[i] > 0) {
				break;
			}
			if(i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int target = 0 - nums[i];
			int j = i + 1;
			int k = len - 1;
			while (j < k) {
				if (nums[j] + nums[k] == target) {
					result.add(Arrays.asList(nums[i], nums[j], nums[k]));
					while (j < k && nums[j] == nums[j + 1]) j++;
					while (j < k && nums[k] == nums[k - 1]) k--;
					j++;
					k--;
				} else if (nums[j] + nums[k] < target) {
					j++;
				} else {
					k--;
				}
			}
		}
		return result;
	}
}
