package Arrays.medium_problems;

public class Next_Permutation {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		nextPermutation(nums);
		System.out.print("Output: [");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i < nums.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void nextPermutation(int[] nums) {
		int ind = -1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				ind = i;
				break;
			}
		}
		if (ind == -1) {
			reverse(nums, 0, nums.length - 1);
			return;
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] > nums[ind]) {
				int temp = nums[i];
				nums[i] = nums[ind];
				nums[ind] = temp;
				break;
			}
		}
		reverse(nums, ind + 1, nums.length - 1);
	}

	static void reverse(int[] a, int low, int high) {
		while (low < high) {
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
	}
}
