package justdoit;

/**
 * Given head, the head of a linked list, determine if the linked list has a
 * cycle in it.
 * 
 * There is a cycle in a linked list if there is some node in the list that can
 * be reached again by continuously following the next pointer. Internally, pos
 * is used to denote the index of the node that tail's next pointer is connected
 * to. Note that pos is not passed as a parameter.
 * 
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * 
 * @author Ethan Huang
 */
public class LinkedListCycle_141 {

//	public boolean hasCycle(ListNode head) {
//		ListNode ans = head;
//		ListNode cur = ans;
//		while (cur != null) {
//			ListNode point = cur.next;
//			ListNode pointS = point;
//			while (point != null) {
//				if (point.next == null) {
//					return false;
//				}
//				if (point.next.equals(cur)) {
//					return true;
//				}
//				point = point.next;
// 				if (point.equals(pointS)) {
//					break;
//				}
//			}
//
//			cur = cur.next;
//		}
//		return false;
//
//	}

	/**
	 * 想不到，上網查的答案 Floyd判圈算法(Floyd Cycle Detection Algorithm) 在環上以不同速度前進的兩點，必定相遇
	 * 
	 * @param head
	 * @return
	 */
	public boolean hasCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;

		if (head == null) {
			return false;
		}
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast.equals(slow)) {
				return true;
			}
		}
		return false;

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
//		ListNode n0 = new ListNode(3, null);
//		ListNode n1 = new ListNode(2, null);
//		ListNode n2 = new ListNode(0, null);
//		ListNode n3 = new ListNode(-4, null);
//		n0.next = n1;
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n2;

//		ListNode n0 = new ListNode(1, null);
//		ListNode n1 = new ListNode(2, null);
//		n0.next = n1;
//		n1.next = n0;

//		ListNode n0 = new ListNode(1, null);

		ListNode n0 = null;

//
//		ListNode list2 = new ListNode(1, null);
		LinkedListCycle_141 a = new LinkedListCycle_141();
		System.out.println(a.hasCycle(n0));

	}
}
