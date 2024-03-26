package justdoit;

public class ValidPalindrome_125 {

	public boolean isPalindrome(String s) {
		String lowerS = s.toLowerCase();
		String newS = "";
		for (int i = 0; i < lowerS.length(); i++) {
			if ((lowerS.charAt(i) >= 'a' && lowerS.charAt(i) <= 'z')
					|| (lowerS.charAt(i) >= '0') && lowerS.charAt(i) <= '9') {
				newS += lowerS.charAt(i);
			}
		}
		if (newS.length() <= 1) {
			return true;
		}
		for (int j = 0; j < newS.length() / 2; j++) {
			if (newS.charAt(j) != newS.charAt(newS.length() - 1 - j)) {
				return false;
			} else if (j == (newS.length() / 2 - 1)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s = " ";
		ValidPalindrome_125 a = new ValidPalindrome_125();
		System.out.println(a.isPalindrome(s));
	}

}
