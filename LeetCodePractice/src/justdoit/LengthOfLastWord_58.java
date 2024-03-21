package justdoit;

public class LengthOfLastWord_58 {

	public int lengthOfLastWord(String s) {
	    
			String s1 = s.trim();
			String sub = s1.substring(s1.lastIndexOf(" ")+1);
			return sub.length();
	}
	
}
