package Arrays.easy_problems;

public class moveZeroes {

	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};

		moveZeroes(nums);

		System.out.print("Updated Array: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

	public static void moveZeroes(int[] nums) {
		int n = nums.length;
		int m = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				m++;
			} else if (m != 0) {
				nums[i - m] = nums[i];
				nums[i] = 0;
			}
		}
	}
}