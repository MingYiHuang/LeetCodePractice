package justdoit;

/**
 * Given an integer x, return true if x is palindrome integer.
 * 
 * An integer is a palindrome when it reads the same backward as forward.
 * 
 * For example, 121 is a palindrome while 123 is not.
 * 
 * 判斷數字是否為"回文"
 * 
 * @author white
 *
 */
public class PalindromeNumber_9 {

	public boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		}
		int forward = x;
		int backward = 0;
		while (x != 0) {
			int num = x % 10;
			backward = backward * 10 + num;
			x = x / 10;

		}

		if (backward == forward) {
			return true;
		} else {
			return false;
		}

	}

}
