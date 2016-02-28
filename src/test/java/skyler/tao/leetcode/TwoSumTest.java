package skyler.tao.leetcode;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void twoSumTest() {
		int[] nums = {2, 7, 11, 15};
		TwoSum testedClass = new TwoSum();
		int[] result = testedClass.twoSum(nums, 18);
		System.out.println("result : [" + result[0] + ", " + result[1] + "]");
	}
}
