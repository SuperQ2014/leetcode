package skyler.tao.leetcode;

public class ZigzagConvert {

	public String convert(String input, int nRows) {
		char[] input_chars = input.toCharArray();
		int input_length = input_chars.length;
		
		StringBuffer[] containers = new StringBuffer[nRows];
		for (int i = 0; i < containers.length; i++) {
			containers[i] = new StringBuffer();
		}
		
		int index_iter = 0;
		while (index_iter < input_length) {
			for (int idx = 0; idx < nRows && index_iter < input_length; idx++) {
				containers[idx].append(input_chars[index_iter++]);
			}
			for (int idx = nRows - 2; idx >= 1 && index_iter < input_length; idx--) {
				containers[idx].append(input_chars[index_iter++]);
			}
		}
		
		for (int idx = 1; idx < containers.length; idx++) {
			containers[0].append(containers[idx]);
		}
		return containers[0].toString();
	}
}
