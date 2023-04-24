// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

 
public class RunningSum1D {
    public int[] runningSum(int[] nums) {
        // loop through the array
        for(int i=1;i<nums.length;i++){
            // add the current value to the previous value
            nums[i]+=nums[i-1];
        }
        // return the array
        return nums;
    }   
}
