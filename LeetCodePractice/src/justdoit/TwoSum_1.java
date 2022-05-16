package justdoit;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 *
 * 目標數字是否為兩陣列中數字之和
 * 
 * @author white
 *
 */
public class TwoSum_1 {
	class Solution {
		public int[] twoSum(int[] nums, int target) {
			int minus = 0;
			int[] ans = new int[2];
			for (int i = 0; i < nums.length; i++) {
				minus = target - nums[i];
				for (int j = i + 1; j < nums.length; j++) {
					if (minus == nums[j]) {
						ans[0] = i;
						ans[1] = j;
						return ans;
					}
				}
			}
			return ans;

		}
	}
}
