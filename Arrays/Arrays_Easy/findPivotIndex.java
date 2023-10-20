package Arrays.easy_problems;

public class findPivotIndex {
	    public static int pivotIndex(int[] nums) {
	        int n = nums.length;
	        int left = 0, sum = 0;
	        
	        for (int i = 0; i < n; i++) {
	            sum += nums[i];
	        }
	        
	        for (int i = 0; i < n; i++) {
	            sum -= nums[i];
	            
	            if (sum == left) {
	                return i;
	            }
	            
	            left += nums[i];
	        }
	        
	        return -1;
	    }

	    public static void main(String[] args) {

	        // Example usage
	        int[] nums = {1, 7, 3, 6, 5, 6};
	        int pivot = pivotIndex(nums);
	        
	        if (pivot != -1) {
	            System.out.println("Pivot index: " + pivot);
	        } else {
	            System.out.println("No pivot index found.");
	        }
	    }
}

