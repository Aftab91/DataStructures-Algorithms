package leetcode_X_GitHub;

import java.util.Arrays;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		
	int[] nums1 = {1,2,3,0,0,0}; 
	int m = 3, n = 3;
	int[] nums2 = {2,5,6}; 
	
	merge(nums1,m,nums2,n);
	
	for(int i =0; i<m+n; i++) {
		
		System.out.print(nums1[i]+" ");
	}
	
	

	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2=n-1, i= m+n-1;
        
        while(p2>=0){
            if( p1>=0  && nums1[p1]>nums2[p2]){
                
                nums1[i] = nums1[p1];
                i--;
                p1--;
            }
            else
            {
                nums1[i] = nums2[p2];
                i--;
                p2--;
            }
        }
        
    }

}
