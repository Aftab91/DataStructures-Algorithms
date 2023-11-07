package Arrays.medium_problems;
import java.util.*;

public class Combination_Sum {
	    
	    static List<List<Integer>> ans = new ArrayList<>();
	    static ArrayList<Integer> ls = new ArrayList<>();
	    
	    public static List<List<Integer>> combinationSum(int[] c, int target) {
	        cum(c, target, 0);
	        return ans;
	    }
	    public static void cum(int[] c, int target, int start) {
	        if (target == 0) {
	            ans.add(new ArrayList<>(ls)); 
	            return;
	        }

	        for (int i = start; i < c.length; i++) {
	            if (c[i] <= target) {
	                ls.add(c[i]);
	                cum(c, target - c[i], i); 
	                ls.remove(ls.size() - 1); 
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] candidates = {2, 3, 6, 7};
	        int target = 7;
	        
	        List<List<Integer>> result = combinationSum(candidates, target);
	        System.out.println("Output: " + result);
	    }
}
