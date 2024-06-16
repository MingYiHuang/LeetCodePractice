package justdoit;

/**
 * 
 * Given the head of a singly linked list, reverse the list, and return the
 * reversed list.
 * 
 * @author Ethan Huang
 */
public class ReverseLinkedList_206 {

	public ListNode reverseList(ListNode head) {
		ListNode now = head;
		ListNode prev = null;
		while (now != null) {
			ListNode next = now.next;
			now.next = prev;
			prev = now;
			now = next;
		}

		return prev;
	}

	public static class ListNode {
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

	public static void main(String[] args) {
//
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));

//		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
//		ListNode list1 = null;
//
//		ListNode list2 = new ListNode(1, null);
		ReverseLinkedList_206 a = new ReverseLinkedList_206();
		ListNode ans = a.reverseList(list1);
//		ListNode ans = list1;
		while (ans != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}

	}
}
