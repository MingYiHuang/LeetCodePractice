package justdoit;

/**
 * * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * @author white
 *
 */
public class AddTwoNumbers_2 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int num = 0;
		boolean over10 = false;

		ListNode l3 = null;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				l1 = new ListNode(0);
			}
			if (l2 == null) {
				l2 = new ListNode(0);
			}
			num = l1.val + l2.val;
			if (over10) {
				num++;
			}
			if (num >= 10) {
				over10 = true;
				num = num % 10;
			} else {
				over10 = false;
			}
			l3 = new ListNode(num, l3);
			l1 = l1.next;
			l2 = l2.next;
		}
		if (over10) {
			l3 = new ListNode(1, l3);
		}
		ListNode l3Ans = null;
		while (l3 != null) {
			l3Ans = new ListNode(l3.val, l3Ans);
			l3 = l3.next;
		}

		return l3Ans;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
