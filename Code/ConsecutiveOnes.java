//Given a binary array nums, return the maximum number of consecutive 1's in the array.

class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,consecutive=0; //Declaring two variables to store the count of 1s and the maximum count of 1s
        for(int i=0 ;i<nums.length;i++){ //Iterating through the array
            
            if(nums[i]==1){ //If the current number is 1
                count++; //Increment the count
            }
            else{ //If the current number is 0
                if(count>consecutive){ //If the count of 1s is greater than the maximum count
                    consecutive=count; //Update the maximum count
                }
                count=0; //Reset the count to 0
            }
        }
        if(count>consecutive){ //If the count of 1s is greater than the maximum count
                    consecutive=count; //Update the maximum count
                }
        return consecutive;
    }
}
