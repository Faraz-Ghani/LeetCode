// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
// representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
// To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be 
// merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Declare and initialize x to 0
        int x =0;
        // Iterate through nums1 until m
        for(int i=0;i<m;i++,x++){
            // Set each element in nums1 to itself
            nums1[i]=nums1[i];
        }
        // Iterate through nums2 until n
        while(x<m+n){
            // Set each element in nums1 to the corresponding element in nums2
            nums1[x]=nums2[x-m];
            // Increment x
            x++;
        }
        // Sort nums1
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        MergeSortedArray m = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int x =3;
        int y=3;
        m.merge(nums1,x,nums2,y);
    
}
}
