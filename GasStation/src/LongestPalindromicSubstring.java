import java.util.ArrayList;

public class LongestPalindromicSubstring {
	
	public static void main(String [] args) {
		System.out.println(longestPalindrome("helloabadbye"));
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
		
		 String reversed = new StringBuilder(s).reverse().toString();
		 
		 for(int i = 0; i < s.length(); i++) {
			 String current = "";
			 int index = reversed.indexOf(s.charAt(i));
			 if(index >= 0) {
				 int j = index;
				 while(s.charAt(j) == reversed.charAt(j) && j < s.length()) {
					 current += s.charAt(j);
					 j++;
				 }
				 palindromes.add(current);
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
