class GasStation {
	
	public static void main(String [] args) {
		int [] gas = {1,2,3,4,5};
		int [] cost  = {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas, cost));
 	}
	
    public static int canCompleteCircuit(int[] gas, int[] cost) {
    	
    		int currentTotal = 0;
    		int total = 0;
    		int start = 0;
    		
    		for(int i = 0; i < gas.length; i++) {
    			
    			int difference = gas[i] - cost[i];
    			
    			if(currentTotal >= 0) {
    				currentTotal += difference;				
    			}
    			else {
    				currentTotal = difference;
    				start = i;	
    			}
    			total += difference;
    		}
    		
    		if(total >= 0) {
    			return start;
    		}
    		else {
    			return -1;
    		}
    		 
    	
    }
}