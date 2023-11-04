package Arrays.medium_problems;

public class Pair_of_Songs_Total_Duration_div_by_60 {
    
	public static int numPairsDivisibleBy60(int[] arr) {
        int n = arr.length;

        long count[] = new long[60];

        for(int i=0; i<n; i++){
            count[arr[i]%60]++;
        }

        long ans = 0;

        for(int i=1; i<30; i++){
            ans = ans + count[i]*count[60-i];
        }

        ans = ans + (count[0]*(count[0]-1))/2 + (count[30]*(count[30]-1))/2;
        return (int)ans;
    }
	
    public static void main(String[] args) {
        int[] time = {30, 20, 150, 100, 40};
        int result = numPairsDivisibleBy60(time);
        System.out.println("Output: " + result);
    }
	
}
