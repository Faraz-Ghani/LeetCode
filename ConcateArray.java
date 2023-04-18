// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] 
// and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

// Specifically, ans is the concatenation of two nums arrays.

// Return the array ans.

public class ConcateArray {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2]; //declare new array with double the size of original array
        int count=0;
        while(count<arr.length){ //while loop runs till array is filled
            for(int i=0;i<nums.length;i++,count++){ //for loop runs till original array is filled
                arr[count]=nums[i]; //assign values from original array to new array
            }
        }
        return arr;
    }
}
