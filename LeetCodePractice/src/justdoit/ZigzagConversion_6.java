package justdoit;

import java.util.HashMap;
import java.util.Map;

public class ZigzagConversion_6 {

	public String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		int mod = 2 * (numRows - 1);
		Map<Integer, String> z = new HashMap<>();
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			for (int r = 1; r <= numRows; r++) {
				int dif = numRows - r;
				int low = (numRows - dif) % mod;
				int up = (numRows + dif) % mod;
				if ((i + 1) % mod == low || (i + 1) % mod == up) {
					System.out.println(low);
					System.out.println(up);
					String sn = z.get(r);
					if (sn == null) {
						sn = "";
					}
					sn += s.charAt(i);
					z.put(r, sn);
				}
			}
		}
		for (int i = 1; i <= z.keySet().size(); i++) {
			System.out.println(z.get(i));
			ans += z.get(i);
		}
		return ans;
	}

	public String bestAns(String s, int numRows) {
		int n = s.length();
		StringBuffer[] arr = new StringBuffer[numRows];
		for (int i = 0; i < numRows; i++)
			arr[i] = new StringBuffer();

		int i = 0;
		while (i < n) {
			/// verticaly downword
			for (int ind = 0; ind < numRows && i < n; ind++) {
				arr[ind].append(s.charAt(i++));
			}
			/// bent upword
			for (int ind = numRows - 2; ind > 0 && i < n; ind--) {
				arr[ind].append(s.charAt(i++));
			}
		}
		StringBuffer ans = new StringBuffer();
		for (StringBuffer el : arr) {
			ans.append(el);
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		ZigzagConversion_6 a = new ZigzagConversion_6();

		System.out.println(a.convert("A", 1));
	}

}
