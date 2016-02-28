package skyler.tao.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

public int[] twoSum(int[] nums, int target) {
        
		int[] result = new int[2];
        if (nums == null || nums.length < 2) return result;
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
        	if (myMap.containsKey(target - nums[i])) {
        		result[0] = myMap.get(target - nums[i]);
        		result[1] = i;
        	} else {
        		myMap.put(nums[i], i);
        	}
        }
        return result;
    }
}
