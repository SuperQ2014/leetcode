package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution229 {

	public List<Integer> majorityElement(int[] nums) {
		if (nums.length < 1) 
			return new ArrayList<Integer>();	//not null
		List<Integer> result = new ArrayList<Integer>();
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for(int number : nums) {
			if (!countMap.containsKey(number)) {
				countMap.put(number, 1);
			} else {
				countMap.put(number, countMap.get(number) + 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			int count = entry.getValue();
			if (count > (nums.length / 3))
				result.add(entry.getKey());
		}
		return result;
	}
	
	public static void main(String[] args) {
		Solution229 mySolution = new Solution229();
		int[] nums = {1,1,1,2,2,2,2,2,2,2};
		List<Integer> result = mySolution.majorityElement(nums);
		for (Integer num : result) {
			System.out.println(num);
		}
	}
}
