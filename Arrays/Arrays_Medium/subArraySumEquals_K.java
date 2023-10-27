package Arrays.medium_problems;

import java.util.HashMap;
public class subArraySumEquals_K {

	public static void main(String[] args) {
		int[] nums = {1, 1, 1};
		int k = 2;
		int result = subarraySum(nums, k);
		System.out.println("Output: " + result);
	}

	public static int subarraySum(int[] nums, int k) {
		int n = nums.length;
		int[] prefix = new int[n];
		prefix[0] = nums[0];

		for (int i = 1; i < n; i++) {
			prefix[i] = nums[i] + prefix[i - 1];
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (prefix[i] == k) {
				count++;
			}

			if (map.containsKey(prefix[i] - k)) {
				count += map.get(prefix[i] - k);
			}

			map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
		}

		return count;
	}
}
