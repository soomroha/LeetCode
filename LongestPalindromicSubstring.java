import java.util.ArrayList;

public class LongestPalindromicSubstring {
	
	public static void main(String [] args) {
		System.out.println(longestPalindrome("hamdaabaahasaan"));
	}
	
	public static boolean isPalindrome(String s) {
	
		if(s.length() == 0 || s.length() == 1) {
			return true;
		}
		else {
			return (s.charAt(0) == s.charAt(s.length() - 1)) && (isPalindrome(s.substring(1, s.length() - 1)));
		}
	}
	
	public static ArrayList<String> longestPalindrome(String s) {
			
		ArrayList<String> palindromes = new ArrayList<String>();
		
		 StringBuilder reversed = new StringBuilder();
		 reversed.append(s);
		 reversed = reversed.reverse();
		 System.out.println(reversed);
		 
		 for(int i = 0; i < s.length(); i++) {
			 String current = "";
			 if(s.charAt(i) == reversed.charAt(i)) {
				 int j = i;
				 while(s.charAt(j) == reversed.charAt(j) && j < s.length()) {
					 current += s.charAt(j);
					 j++;
				 }
				 palindromes.add(current);
				 i = j;
			 }
		 }
		 
		 return palindromes;
		
		
		
				
/*		if(palindromes.size() == 0) {
			return "";
		}
		
		int max = palindromes.get(0).length();
		String longest = palindromes.get(0);
		

		for(int i = 0; i < palindromes.size(); i++) {
			if(palindromes.get(i).length() > max) {
					
				longest = palindromes.get(i);
				max = palindromes.get(i).length();
			}
		}
		
		return longest;*/

    }

}
