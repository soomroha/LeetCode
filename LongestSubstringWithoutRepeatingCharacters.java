import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String [] args) {
		System.out.println(lengthOfLongestSubstring("dvdf"));
	}

	public static int lengthOfLongestSubstring(String s) {
		
		HashSet<Character> seen = new HashSet<Character>();
		int slider1 = 0;
		int slider2 = 0;
		int max = 0;
		
		while(slider1 < s.length() && slider2 < s.length()) {
			
			char c = s.charAt(slider2);
			
			if(!seen.contains(c)) {
				seen.add(c);
				slider2++;
				max = Math.max(max, slider2 - slider1);	
			}
			else {
				seen.remove(s.charAt(slider1));
				slider1++;
			}
		}
		
		return max;
	}

}
