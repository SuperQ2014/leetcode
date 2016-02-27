package skyler.tao.leetcode;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ThreeSumTest {

	@Test
	public void threeSumTest() {
//		int[] nums = {-1, 0, 1, 2, -1, -4};
		int[] nums = {-1, -1, -4, -4, 0, 1, 2, 2, 4};
		int[] sortedNums = nums;
		Arrays.sort(sortedNums);
		for(int i : sortedNums) {
			System.out.print(i + " ");
		}
		System.out.println("\n============");
		ThreeSum threeSumClass = new ThreeSum();
		List<List<Integer>> result = threeSumClass.threeSum(nums);
		for (List<Integer> triplet : result) {
			for (Integer number : triplet) {
				System.out.print(number + " ");
			}
			System.out.println("");
		}
	}
}
