// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
// That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

// Return the answer in an array.

public class NumsSmallerThanCurrent{
public int[] smallerNumbersThanCurrent(int[] nums) {
    //create a new array of the same length as the input array
    int res[] = new int[nums.length];
    //iterate over all elements of the input array
    for(int i=0;i<nums.length;i++){
        //compare the current element with all elements of the input array
        for(int j=0;j<nums.length;j++){
            //if the current element is greater than the element being compared with
            if(nums[i]>nums[j]  ){
                //increment the value in the new array
                res[i]++;
            }
        }
    }
    //return the new array
    return res;
}
}