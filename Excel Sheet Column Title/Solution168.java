

public class Solution168 {

	public String convertToTitle(int n) {
		
		if (n <= 0)
			return "";
		
		StringBuilder result = new StringBuilder();
		int remainder = n;	//余数
		int mod_result = 0;	//模
		while (remainder > 0) {
			remainder--;
			mod_result = remainder % 26;
			remainder = (remainder - mod_result) / 26;
			result.insert(0, (char)(mod_result + 'A'));
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		Solution168 mySolution = new Solution168();
		
		String result = mySolution.convertToTitle(1);
		System.out.println(result);
	}
}
