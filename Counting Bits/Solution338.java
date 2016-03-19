
public class Solution338 {

	public int[] countBits(int num) {

		int[] result = new int[num + 1];
		for (int i = 1; i < num + 1; i++) {
			result[i] = result[i >> 1] + i % 2;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Solution338 mySolution = new Solution338();
		int[] result = mySolution.countBits(5);
		for (int i : result) 
			System.out.println(i);
	}
}
