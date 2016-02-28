package skyler.tao.leetcode;

import org.junit.Test;

public class ThreeSumClosestTest {

	@Test
	public void threeSumTest() {
//		int[] nums = {0,0,0};
		int[] nums = {-1, 2, 1, -4};
		int target = 1;
		ThreeSumClosest testedClass = new ThreeSumClosest();
		int result = testedClass.threeSum(nums, target);
		System.out.println(result);
	}
}
