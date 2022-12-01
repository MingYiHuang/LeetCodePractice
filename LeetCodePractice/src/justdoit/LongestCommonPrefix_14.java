package justdoit;

public class LongestCommonPrefix_14 {
	public String longestCommonPrefix(String[] strs) {
		String ans = "";

		String shortest = strs[0];
		for (int i = 0; i < strs.length; i++) {// 取最短字當目標
			if (strs[i].length() < shortest.length()) {
				shortest = strs[i];
			}
		}
		for (int i = shortest.length(); i > 0; i--) {// 從最大長度開始取
			String match = shortest.substring(0, i);// 取出子元素
			for (int k = 0; k < strs.length; k++) {
				if (!strs[k].substring(0, i).equals(match)) {
					break;
				}
				if (k == strs.length - 1) {
					return match;
				}
			}
		}
		return ans;

	}
//	public String longestCommonPrefix(String[] strs) {
//		String ans = "";
//		// 取最短字當目標
//		String shortest = strs[0];
//		for (int i = 0; i < strs.length; i++) {
//			if (strs[i].length() < shortest.length()) {
//				shortest = strs[i];
//			}
//		}
//
//		System.out.println("shortest=" + shortest);
//		for (int i = shortest.length(); i > 0; i--) {// 從最大長度開始取
//			System.out.println("i=" + i);
//			for (int j = 0; j < shortest.length() - i + 1; j++) {
//				String match = shortest.substring(0, i);// 取出子元素
//				System.out.println("match=" + match);
//				for (int k = 0; k < strs.length; k++) {
//
//					System.out.println("strs[k]=" + strs[k]);
//					System.out.println("strs[k].contains(match)" + strs[k].contains(match));
//					if (!strs[k].substring(0, i).equals(match)) {
//						break;
//					}
//					if (k == strs.length - 1) {
//						return match;
//					}
//				}
//			}
//		}
//
//		return ans;
//	}

	public static void main(String[] args) {
		String[] strs = { "reflower", "flow", "flight" };
		LongestCommonPrefix_14 a = new LongestCommonPrefix_14();
		System.out.println("ans=" + a.longestCommonPrefix(strs));
	}
}
