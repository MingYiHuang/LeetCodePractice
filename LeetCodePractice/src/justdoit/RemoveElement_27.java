package justdoit;

public class RemoveElement_27 {
	public int removeElement(int[] nums, int val) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				continue;
			}
			nums[j] = nums[i];
			j++;
		}
//		for (int i = 0; i < j + 1; i++) {
//			System.out.print(nums[i]);
//		}

		return j ;
	}

	public static void main(String[] args) {
		int[] nums = { };
		RemoveElement_27 a = new RemoveElement_27();
		a.removeElement(nums, 0);
	}
}
