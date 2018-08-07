import java.util.ArrayList;

public class ContainerWithMostWater {
	
	public static void main(String[] args) {
		
		int [] heights = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea2(heights));
	}
	
	public static int maxArea2(int [] height) {
		
		int i = 0;
		int j = height.length - 1;
		int max = 0;
		
		while(i != j && i < height.length) {
			
			int h = Math.min(height[i], height[j]);
			int width = j - i;
			int area = h * width;
			if (area > max) {
				max = area;
			}
			
			if(height[i] < height[j]) {
				i++;
			}
			else {
				j--;
			}
			
		}
		return max;
	}

    public static int maxArea(int[] height) {
    	    		
    		int maxArea = 0;
    		
    		for(int i = 0; i < height.length; i++) {
    			
    			for(int j = i + 1; j < height.length; j++) {
    				
    				int width = j -i;
    				int h = Math.min(height[i], height[j]);
    				int area = width * h;
    				if(area > maxArea) {
    					maxArea = area;
    				}
    				
    			}
    			
    		}
    		return maxArea;
        
    }
}
