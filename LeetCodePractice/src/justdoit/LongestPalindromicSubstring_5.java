package justdoit;

public class LongestPalindromicSubstring_5 {
	public String longestPalindrome(String s) {
		String ans = "";
		String sub1 = "";
		for (int i = 0; i < s.length(); i++) {
			int j = s.lastIndexOf(s.charAt(i));
			sub1 = s.substring(i, j + 1);
			if (sub1.length() > ans.length()) {
				String sub2 = sub1;
				for (int k = 0; k < sub1.length(); k++) {
					sub2 = sub1.substring(0, k + 1);
					if (sub2.length() > ans.length()) {
						if (isPalindrome(sub2)) {
							ans = sub2;
						}
					} else {
						continue;
					}
				}
			} else {
				continue;
			}

		}

		return ans;

	}

	public boolean isPalindrome(String s) {
		if (s.length() == 1) {
			return true;
		}
		for (int j = 0; j < s.length() / 2; j++) {
			if (s.charAt(j) != s.charAt(s.length() - 1 - j)) {
				return false;
			} else if (j == (s.length() / 2 - 1)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		LongestPalindromicSubstring_5 a = new LongestPalindromicSubstring_5();
		System.out.print(a.longestPalindrome("babadada"));

	}
}
