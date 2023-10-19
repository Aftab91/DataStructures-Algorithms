package Arrays.easy_problems;

public class runningSumof1D_Array {

	public static int[] runningSum(int[] nums) {
		int n = nums.length;
		for (int i = 1; i < n; i++) {
			nums[i] = nums[i - 1] + nums[i];
		}
		return nums;
	}

	public static void main(String[] args) {
		// Example usage
		int[] inputArray = {1, 2, 3, 4};
		int[] result = runningSum(inputArray);

		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
