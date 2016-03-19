public class Solution2 {

	public class ListNode {
		int val;
		ListNode next;
		ListNode (int x) {
			this.val = x;
		}
	}
	
	public ListNode addTwoNumbers (ListNode l1, ListNode l2) {
		
		if (l1 == null || l2 == null) 
			return null;
		
		return num2list(list2num(l1) + list2num(l2));
	}
	
	public long list2num(ListNode list) {
        
		long num = 0l;
        int count = 0;
        ListNode tempNode = list;

        while (tempNode != null) {
        	
        	num += (long)tempNode.val * (long)Math.pow(10, count);
        	tempNode = tempNode.next;
        	count++;
        }
        return num;
    }
	
    public ListNode num2list(long num) {

    	if (num < 0) 
    		return null;
    	int tempValue = (int) (num % 10);
    	long shortedNum = num / 10;
    	ListNode head = new ListNode(tempValue);
    	ListNode tail = head;

    	while (shortedNum > 0) {
    		
    		tempValue = (int) (shortedNum % 10);
    		ListNode tempNode = new ListNode(tempValue);
    		tail.next = tempNode;
    		tail = tempNode;
    		shortedNum = shortedNum / 10;
    	}
    	return head;
    }
    
    public static void main(String[] args) {
    	Solution2 mySolution = new Solution2();
    	Solution2.ListNode first1 = new Solution2().new ListNode(9);
    	
    	Solution2.ListNode a11 = new Solution2().new ListNode(9);
    	Solution2.ListNode a10 = new Solution2().new ListNode(9);
    	Solution2.ListNode a9 = new Solution2().new ListNode(9);
    	Solution2.ListNode a8 = new Solution2().new ListNode(9);
    	Solution2.ListNode a7 = new Solution2().new ListNode(9);
    	Solution2.ListNode a6 = new Solution2().new ListNode(9);
    	Solution2.ListNode a5 = new Solution2().new ListNode(9);
    	Solution2.ListNode a4 = new Solution2().new ListNode(9);
    	Solution2.ListNode a3 = new Solution2().new ListNode(9);
    	Solution2.ListNode a2 = new Solution2().new ListNode(9);
    	Solution2.ListNode a1 = new Solution2().new ListNode(1);
    	a1.next = a2;
    	a2.next = a3;
    	a3.next = a4;
    	a4.next = a5;
    	a5.next = a6;
    	a6.next = a7;
    	a7.next = a8;
    	a8.next = a9;
    	a9.next = a10;
    	a10.next = a11;
    	long a_num = mySolution.list2num(a1);
    	System.out.println(a_num);
    	long b_num = mySolution.list2num(first1);
    	System.out.println(b_num);
    	ListNode sumNode = mySolution.addTwoNumbers(first1, a1);
    	ListNode sum1 = sumNode;
    	ListNode sum2 = sum1.next;
    	ListNode sum3 = sum2.next;
    	ListNode sum4 = sum3.next;
    	ListNode sum5 = sum4.next;
    	ListNode sum6 = sum5.next;
    	ListNode sum7 = sum6.next;
    	ListNode sum8 = sum7.next;
    	ListNode sum9 = sum8.next;
    	ListNode sum10 = sum9.next;
    	System.out.println(sum1.val +"" + sum2.val + sum3.val + sum4.val + sum5.val + sum6.val + sum7.val + sum8.val + sum9.val + sum10.val);
    	
    }
}
