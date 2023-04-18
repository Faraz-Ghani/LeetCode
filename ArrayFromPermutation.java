// Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

// A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

public class ArrayFromPermutation{
    public int[] buildArray(int[] nums) {
        //Create an array with the same length as nums
        int arr[]= new int[nums.length];
        //Iterate over the nums array
        for(int i =0 ;i<nums.length;i++ ){
            //Assign the value at the index of the nums array to the index of the new array
            arr[i]=nums[nums[i]];
        }
        //Return the new array
        return arr;
    }    
}