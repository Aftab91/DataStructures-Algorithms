package leetcode_X_GitHub;

import java.util.Arrays;

public class Best_time_to_Buy_and_Sell_Stock1 {
	
   
	public static void main(String args[]) {
		
		int[] arr = {7,1,5,3,6,4};
		int ans = maxProfit(arr);
		System.out.println(ans);
		
	}
	
	
	public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i =0; i<prices.length; i++){
          if(prices[i]<minprice){
            minprice = prices[i];
          }
          else if(prices[i] - minprice > maxprofit){
            maxprofit = prices[i] - minprice;
          }
        }
      return maxprofit;
    }
    

}
