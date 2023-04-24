import java.util.Arrays;

/*
Given an integer array nums, return true if any value appears at least
twice in the array, and return false if every element is distinct.
*/
class ContainDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); //sort the array
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])return true; //if two adjacent elements are equal, then return true
        }
        return false;
    }
}