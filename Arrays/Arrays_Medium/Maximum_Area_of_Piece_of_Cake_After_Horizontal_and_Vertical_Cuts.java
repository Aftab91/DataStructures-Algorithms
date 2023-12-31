package Arrays.medium_problems;
import java.util.*;


public class Maximum_Area_of_Piece_of_Cake_After_Horizontal_and_Vertical_Cuts {
    
	public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        // Max Difference between any two horizontal cuts * Max Difference between any two vertical cuts will give the answer
        Arrays.sort(horizontalCuts); // to get consecutive cuts
        Arrays.sort(verticalCuts);
        long mod = (long)1e9+7;
        long a = 0,b = 0; // a = max diff of horizontal cuts b = max diff of vertical cuts
        int prev =0; // two edges of cake (0 - first cut)
        a = Math.max(a,h-horizontalCuts[horizontalCuts.length-1]); // and (edge - last cut) of the cake
        b = Math.max(b,w-verticalCuts[verticalCuts.length-1]);
        for(int i:horizontalCuts){
            a = Math.max(a,i-prev);
            prev = i;
        }
        prev = 0;
        for(int i:verticalCuts){
            b = Math.max(b,i-prev);
            prev = i;
        }
        return (int)((a*b)%mod);
    }
    
    public static void main(String[] args) {
        int h = 5;
        int w = 4;
        int[] horizontalCuts = {1, 2, 4};
        int[] verticalCuts = {1, 3};

        int result = maxArea(h, w, horizontalCuts, verticalCuts);
        System.out.println("Maximum Cake Area: " + result);
    }
    
}
