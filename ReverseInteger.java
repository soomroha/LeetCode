
public class ReverseInteger {
	
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}

	public static int reverse(int x) {
		
		if(x == 0) {
			return 0;
		}
		
		boolean isNegative = false;
		String s = "";
		
		if(x < 0) {
			isNegative = true;
			x = x * -1;
		}
		
		while(x > 0) {
			int digit = x % 10;
			s += Integer.toString(digit);
			x = x / 10;
		}
		
		int reversed = 0;
		try {
			 reversed = Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			return 0;
		}
		if(isNegative) {
			return -1 * (int)reversed;
		}
		return (int)reversed;
		
    }
}
