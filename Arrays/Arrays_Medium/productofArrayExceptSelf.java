package Arrays.medium_problems;

public class productofArrayExceptSelf {

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] pre = new int[n];
		int[] suff = new int[n];
		pre[0] = 1;
		suff[n - 1] = 1;

		// Calculate the product of elements to the left of each element
		for (int i = 1; i < n; i++) {
			pre[i] = pre[i - 1] * nums[i - 1];
		}

		// Calculate the product of elements to the right of each element
		for (int i = n - 2; i >= 0; i--) {
			suff[i] = suff[i + 1] * nums[i + 1];
		}

		int[] ans = new int[n];

		// Multiply the left and right products to get the result
		for (int i = 0; i < n; i++) {
			ans[i] = pre[i] * suff[i];
		}

		return ans;
	}

	public static void main(String[] args) {


		// Example usage
		int[] nums = {1, 2, 3, 4}; // Replace with your input
		int[] result = productExceptSelf(nums);

		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
