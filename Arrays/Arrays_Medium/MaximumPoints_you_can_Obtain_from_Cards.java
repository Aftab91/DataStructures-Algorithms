package Arrays.medium_problems;

public class MaximumPoints_you_can_Obtain_from_Cards {
	
	//maxScore
    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length, totalSum = 0, minSubarray = 0;

	    for(int i=0, currSum=0; i<n; i++) {
		    totalSum += cardPoints[i];
		    currSum += cardPoints[i];
		    if (i < n-k) minSubarray += cardPoints[i];
		    else {
			currSum -= cardPoints[i-(n-k)];
			minSubarray = Math.min(minSubarray, currSum);
		    }
	    }
	    return totalSum - minSubarray;
    }
    
    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        int result = maxScore(cardPoints, k);
        System.out.println("Maximum score: " + result);
    }
}
