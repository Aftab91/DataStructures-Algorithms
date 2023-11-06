package Arrays.medium_problems;
import java.util.*;


public class FindTheDuplicateNumber {

	public static int findDuplicate(int[] nums) {
		int i = 0;
		while (i < nums.length) 
		{
			int correctpos = nums[i] - 1;
			if(nums[i] != i+1){
				if (nums[correctpos] != nums[i]){
					int temp = nums[i];
					nums[i] = nums[correctpos];
					nums[correctpos] = temp;
				} 
				else{
					return nums[i];
				}
			}   
			else{
				i++;
			}
		}
		return -1;
	}
	
	
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
       
        int result = findDuplicate(nums);
        System.out.println("Output: " + result);
    }

}
