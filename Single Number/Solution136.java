
public class Solution136 {

	public int singleNumber(int[] nums) {
		
		int result = nums[0];
		for (int i = 1; i < nums.length; i++)
			result = nums[i] ^ result;
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,1,2,3,3,2,5,7,5};
		Solution136 mySolution = new Solution136();
		int result = mySolution.singleNumber(nums);
		System.out.println(result);
	}
}
