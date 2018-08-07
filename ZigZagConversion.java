import java.util.Arrays;

public class ZigZagConversion {
	
	 public static void main(String[] args) {
		 
		 String result = convert("PAYPALISHIRING", 4);
		 System.out.println(result);
		 
	 }
	
	 public static String convert(String s, int numRows) {
		 
		 if(numRows == 1) {
			 return s;
		 }
		 
		 int currentRow = 0;
		 boolean goingDown = true;
		 
		 
		 String[] rows = new String[numRows];
		 
		 for(int k = 0; k < rows.length; k++) {
			 rows[k] = "";
		 }
		 
		 for(int i = 0; i < s.length();i++) {
			 rows[currentRow] += s.charAt(i);
			 
			 if(currentRow == 0) {
				 goingDown = true;
			 }
			 else if(currentRow == numRows -1) {
				 goingDown = false;
			 }
			 
			 if(goingDown) {
				 currentRow++;
			 }
			 else {
				 currentRow--;
			 }
		 }
		 
		 
		 
		 String finalString = "";
		 
		 for(String current: rows) {
			 finalString += current;
		 }
		 return finalString;
		 
	 }

}
