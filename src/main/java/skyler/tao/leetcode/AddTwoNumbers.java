package skyler.tao.leetcode;

public class AddTwoNumbers {

	public class ListNode {
		int val;
		ListNode next;
		ListNode (int x) {
			val = x;
		}
	}
	
	public ListNode addTwoNumbers (ListNode l1, ListNode l2) {
		
		if (l1 == null || l2 == null) 
			return null;
		
		return num2list(list2num(l1) + list2num(l2));
	}
	
	public int list2num(ListNode list) {
        
		int num = 0;
        int count = 0;
        while (list != null) {
        	num += list.val * (int)Math.pow(10, count);
        	list = list.next;
        	count++;
        }
        return num;
    }
	
    public ListNode num2list(int num) {
        ListNode list = new ListNode(0);
        
        int value = num % 10;
        return list;
    }
}
