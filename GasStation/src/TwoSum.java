import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
	
	public static void main(String[] args) {
		int [] arr = {-18, 12, 3, 0};
		int [] result = twoSum(arr, -6);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		
		int [] result = new int[2];
		
		ArrayList<Integer> seen = new ArrayList<Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			int second = target - nums[i];
			if(seen.contains(nums[i])) {
				result[0] = second;
				result[1] = nums[i];
			}
			seen.add(second);
		}
		
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == result[0]) {
				result[0] = i;
			}
			else if(nums[i] == result[1]) {
				result[1] = i;
				return result;
			}
			
		}
		return result;        
    }
}
