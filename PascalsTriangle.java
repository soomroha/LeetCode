import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
    		
    	if(numRows == 0) {
    		return triangle;
    	}
        
        ArrayList<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        if(numRows == 1) {
    		return triangle;
        }        
        
        for(int i = 1; i < numRows; i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            List<Integer> previous = triangle.get(i-1);
            row.add(1);
            
            for(int j = 1; j < previous.size(); j++) {
            		row.add(previous.get(j) + previous.get(j-1));
            }
            
            row.add(1);
            triangle.add(row);
        }
        
        return triangle;
    }
}
