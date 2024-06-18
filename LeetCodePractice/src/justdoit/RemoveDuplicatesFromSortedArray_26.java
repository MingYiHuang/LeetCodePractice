package justdoit;

public class RemoveDuplicatesFromSortedArray_26 {
	public int removeDuplicates(int[] nums) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[j] != nums[i]) {
				j++;
				nums[j] = nums[i];
			}
		}
		for (int i = 0; i < j + 1; i++) {
			System.out.print(nums[i]);
		}

		return j + 1;
	}

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4 };
		RemoveDuplicatesFromSortedArray_26 a = new RemoveDuplicatesFromSortedArray_26();
		a.removeDuplicates(nums);
	}
}
