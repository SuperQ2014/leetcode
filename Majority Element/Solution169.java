

public class Solution169 {

	public int majorityElement(int[] nums) {
		int result = 0;
		for (int i = 0; i < 32; i++) {
			int zeros = 0;
			int ones = 0;
			for (int j = 0; j < nums.length; j++) {
				if ((nums[j] & (1 << i)) != 0) {
					++ones;
				} else {
					++zeros;
				}
				
				if (ones > zeros)
					result |= (1 << i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Solution169 mySolution = new Solution169();
		int[] nums = {1,1,1,2,2};
		int result = mySolution.majorityElement(nums);
		System.out.println(result);
	}
}
