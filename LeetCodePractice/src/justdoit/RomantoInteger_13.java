package justdoit;

public class RomantoInteger_13 {
	public int romanToInt(String s) {
		int ans = 0;
		int i = 0;
		while (i < s.length()) {
			char ss = s.charAt(i);
			switch (ss) {
			case 'M':
				ans += 1000;
				break;
			case 'D':
				ans += 500;
				break;
			case 'C':
				ans += 100;
				break;
			case 'L':
				ans += 50;
				break;
			case 'X':
				ans += 10;
				break;
			case 'V':
				ans += 5;
				break;
			case 'I':
				ans += 1;
				break;

			}
			i++;
		}
		if (s.contains("CM") || s.contains("CD")) {
			ans -= 200;
		}
		if (s.contains("XC") || s.contains("XL")) {
			ans -= 20;
		}
		if (s.contains("IX") || s.contains("IV")) {
			ans -= 2;
		}
		return ans;

	}

	public static void main(String[] args) {
		RomantoInteger_13 a = new RomantoInteger_13();
		System.out.print(a.romanToInt("III"));

	}

}
