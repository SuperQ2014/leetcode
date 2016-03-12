package skyler.tao.leetcode;

import org.junit.Test;

import skyler.tao.leetcode.AddTwoNumbers.ListNode;

public class AddTwoNumbersTest {

//	@Test
	public void addTwoNumbersTest() {
		int result = (int) Math.pow(10, 3);
		System.out.println(result);
	}
	
//	@Test
	public void list2numTest() {
		AddTwoNumbers testedClass = new AddTwoNumbers();
		ListNode first = testedClass.new ListNode(1);
		ListNode second = testedClass.new ListNode(2);
		ListNode third = testedClass.new ListNode(3);
		first.next = second;
		second.next = third;
		third.next = null;
		int num = testedClass.list2num(first);
		System.out.println(num);
	}
	
	@Test
	public void num2listTest() {
		int num = 4321;
		while (num > 0) {
			num = num - num /10;
			System.out.println(num);
		}
		int first = num % 10;
		int second = (num - first) / 10 % 10;
		int third = (num - second * 10) % 10;
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}
