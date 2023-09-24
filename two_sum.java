package Arrays.easy_problems;
import java.util.*;
public class two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,6,5,8,11};
		int target = 14;
		int[] ans = twoSum(arr,target);
		System.out.println(Arrays.toString(ans));
		
	}
	
	public static int[] twoSum(int[] nums, int target){
		
		int n= nums.length;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(nums[i]+nums[j] == target) {
					return new int[]{i,j};
				}
			}
		}
		return new int[]{};
	}

}
