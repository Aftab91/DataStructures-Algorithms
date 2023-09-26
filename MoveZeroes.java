package leetcode_X_GitHub;

public class MoveZeroes {

	public static void main(String[] args) {
		
		int[] nums = {0,1,0,3,12};
		
		moveZeroes(nums);
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}

	}
	
    public static void moveZeroes(int[] nums) {
        
    if (nums == null || nums.length == 0) return;        

    int insertPos = 0;
    for (int num: nums) {
        if (num != 0) nums[insertPos++] = num;
    }        

    while (insertPos < nums.length) {
        nums[insertPos++] = 0;
    }

    }

}
