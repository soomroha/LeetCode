class GasStation {
	
	public static void main(String [] args) {
		int [] gas = {1,2,3,4,5};
		int [] cost  = {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas, cost));
 	}
	
    public static int canCompleteCircuit(int[] gas, int[] cost) {
    		
    		int delta=0;
    		int count=0; 
    		
    		for (int i= 0 ; i<2*n-1; i++) { 
    			delta+=gasMinusDist[i]; 
    			if (delta<0) {
    				delta=0;
    				count=0;
    				continue;
    			} 
    			count++; 
    			if (count==n) {
    				break; 
    			}
    		} 
    		if (count ==n) {
    			printf("start round from gas station number %d,i-count+1); 
    		}
    		else {
    			printf("not possible...");
    		}
        
    }
}