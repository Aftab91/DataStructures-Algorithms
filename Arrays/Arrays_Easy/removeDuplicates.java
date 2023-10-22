package Arrays.easy_problems;

public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // Example usage
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Replace with your input array
        int result = removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + result);

        // Print the modified array (first 'result' elements contain the unique values)
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
