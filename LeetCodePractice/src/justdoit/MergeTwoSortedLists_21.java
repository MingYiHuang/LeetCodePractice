package justdoit;

import java.util.ArrayList;

public class MergeTwoSortedLists_21 {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		}

		ArrayList<Integer> l1 = new ArrayList<>();
		ListNode last = new ListNode(9999, null);
		ListNode cur = new ListNode(-1, null);
		ListNode ans = cur;
		boolean go = true;
		while (go) {
			int n1 = list1.val;
			int n2 = list2.val;
			if (n1 <= n2) {
				cur.next = list1;
				list1 = list1.next;
				if (list1 == null) {
					list1 = last;
				}
			} else {
				cur.next = list2;
				list2 = list2.next;
				if (list2 == null) {
					list2 = last;
				}
			}
			cur = cur.next;
			if (list1.equals(last) && list2.equals(last)) {
				go = false;
			}
		}
		return ans.next;
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

		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
//		ListNode list1 = null;
//
//		ListNode list2 = new ListNode(1, null);
		MergeTwoSortedLists_21 a = new MergeTwoSortedLists_21();
		System.out.print(a.mergeTwoLists(list1, list2));

	}
}
