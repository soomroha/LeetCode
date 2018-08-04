
public class LongestCommonPrefix {
	
	public static String getLongestCommonPrefix(String [] strs) {
		        
        	if (strs.length == 0 || strs.length == 1){
            		return "";
        	}
        
        	String s1 = strs[0];
        	String prefix = "";
        
        	for(int i = 0; i < s1.length(); i++) {
        		char c = s1.charAt(i);
        		boolean occursInAll = true;
        		for(int j = 1; j < strs.length; j++) {
        			String s = strs[j];
        			if(i >= s.length()) {
        				occursInAll = false;
        				break;
        			}
        			
        			if(s.charAt(i) != c) {
        				occursInAll = false;
        				break;
        			}
        		}
        		
        		if(occursInAll) {
        			prefix += c;
        		}
        		else {
        			break;
        		}
        	}
        
        	return prefix;  
	}
}
