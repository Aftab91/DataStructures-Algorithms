package Arrays.easy_problems;

public class majorityElement {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {3, 2, 3};
        int majority = majorityElement(nums);
        
        System.out.println("Majority Element: " + majority);
    }

}
