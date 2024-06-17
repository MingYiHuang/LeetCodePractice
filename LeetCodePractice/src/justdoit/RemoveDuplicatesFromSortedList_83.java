package justdoit;

public class RemoveDuplicatesFromSortedList_83 {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode ans = head;
		ListNode cur = ans;
		while (cur != null) {
			if (cur.next != null && cur.val == cur.next.val) {
				if (cur.next.next != null) {
					cur.next = cur.next.next;
				} else {
					cur.next = null;
					break;
				}
			} else {
				cur = cur.next;
			}
		}
		return ans;
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
//		ListNode list1 = new ListNode(1, new ListNode(1, null));

//		ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(1, null)));
		ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null)))));
//		ListNode list1 = null;
//
//		ListNode list2 = new ListNode(1, null);
		RemoveDuplicatesFromSortedList_83 a = new RemoveDuplicatesFromSortedList_83();
		ListNode ans = a.deleteDuplicates(list1);
//		ListNode ans = list1;
		while (ans != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}

	}
}
