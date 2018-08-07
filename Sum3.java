import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Sum3 {
	
	public static void main(String[] args) {
		int [] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}
	
	public static ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
		
		 ArrayList<ArrayList<Integer>> pairs = new ArrayList<ArrayList<Integer>>();
		 int [] nums = numbers;
		 java.util.Arrays.sort(nums);
		 
		 for(int i = 1; i < nums.length; i++) {
			 
			 if(nums[i] == nums[i-1] && i > 0) {
				 continue;
			 }
			 
			 int target = nums[i] * -1;
			 
			 int low = i + 1;
			 int high = nums.length -1;
			 
			 while(low < high) {
				 
				 if(nums[low] + nums[high] == target) {
					 ArrayList<Integer> triplet = new ArrayList<Integer>();
					 triplet.add(target * -1); triplet.add(nums[low]); triplet.add(nums[high]);
					 pairs.add(triplet);
					 while(low < high && nums[low] == nums[low +1]) {low++;}
					 while(low < high && nums[high] == nums[high-1]) {high--;}
					 low++;
					 high--;
				 }
				 else if(nums[low] + nums[high] < target) {
					 low++;
				 }
				 else {
					 high--;
				 }
			 }
			 
		 }

		 return pairs;
    }

}
