package justdoit;

public class ValidParentheses_20 {

//	public boolean isValid(String s) {
//
//		for (int i = 0; i < s.length(); i++) {
//			switch (s.charAt(i)) {
//			case '(':
//				break;
//			case '[':
//				break;
//			case '{':
//				break;
//			case ')':
//				break;
//			case ']':
//				break;
//			case '}':
//				break;
//			}
//
//		}
//		return true;
//
//	}
	public boolean isValid(String s) {
		while (!s.isEmpty()) {
			System.out.println(s);
			if (s.contains("()")) {
				s = s.replace("()", "");
				continue;
			} else if (s.contains("{}")) {
				s = s.replace("{}", "");
				continue;
			} else if (s.contains("[]")) {
				s = s.replace("[]", "");
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ValidParentheses_20 a = new ValidParentheses_20();
		String s = "([])[]{}";
		System.out.print(a.isValid(s));
	}

}
