
public class StringtoInteger {
	
	public static void main(String [] args) {
		
		System.out.println(myAtoi("899999999999999999"));
		
	}
	
	public static int myAtoi(String str) {
		
		String s = "";
		boolean isNegative = false;
		
		int i = 0;
		while(i < str.length() && str.charAt(i) == ' ') {
			i++;
		}
		if (i == str.length()) {
			return 0;
		}
		
		if(!(str.charAt(i) == '-' || Character.isDigit(str.charAt(i)))) {
			return 0;
		}
		
		if(str.charAt(i) == '-') {
			isNegative = true;
			i++;
		}
		
		while(i < str.length() && Character.isDigit(str.charAt(i))) {
			s += str.charAt(i);
			i++;
		}
		if(isNegative) {
			s = '-' + s;
		}
		
		int number = 0;
		
		try {
			number = Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			if(isNegative) {
				return Integer.MIN_VALUE;
			}
			else {
				
				return Integer.MAX_VALUE;
			}
		}
		
		return number;
        
    }

}
