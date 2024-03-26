package justdoit;

public class LongestSubstringWithoutRepeat_3 {

//	public int lengthOfLongestSubstring(String s) {
//		int ans = 0;
//		if (s.length() < 2) {
//			ans = s.length();
//		}
//		char[] ca = s.toCharArray();
//		String s2 = "";
//		for (int i = 0; i < ca.length; i++) {
//			s2 += ca[ca.length - 1 - i];
//		}
//		for (int i = 0; i < s.length() - 1; i++) {
//			int start = i;
//			int end = s.indexOf(s.charAt(i), i + 1);
//			if (end == -1) {
//				end = s.length();
//			}
//			int len = end - start;
//			if (len > ans) {
//				String sub = s.substring(start, end);
//				if (notRepeat(sub)) {
//					ans = len;
//				}
//			}
//		}
//		for (int i = 0; i < s2.length() - 1; i++) {
//			int start = i;
//			int end = s2.indexOf(s2.charAt(i), i + 1);
//			if (end == -1) {
//				end = s2.length();
//			}
//			int len = end - start;
//			if (len > ans) {
//				String sub = s2.substring(start, end);
//				if (notRepeat(sub)) {
//					ans = len;
//				}
//			}
//		}
//		return ans;
//	}

	public int lengthOfLongestSubstring(String s) {
		int ans = 0;

		for (int i = 0; i < s.length(); i++) {
			int low = i;
			int high = i+1;
			for (int j = i; j >= 0; j--) {
				for (int k = high; k < s.length() - 1; k++) {
					if (notRepeat(s.substring(j, k))) {
						high = k;
					}
				}
				if (notRepeat(s.substring(j, high))) {
					low = j;
				}
			}
			int len = high - low;
			if (len > ans) {
				ans = len;
			}
		}
		return ans;
	}

	public boolean notRepeat(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.lastIndexOf(s.charAt(i)) != i) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		LongestSubstringWithoutRepeat_3 a = new LongestSubstringWithoutRepeat_3();
		System.out.println(a.lengthOfLongestSubstring(""));
	}

}
