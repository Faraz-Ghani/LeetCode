//Given a binary array nums, return the maximum number of consecutive 1's in the array.

class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,consecutive=0;
        for(int i=0 ;i<nums.length;i++){
            
            if(nums[i]==1){
                count++;
            }
            else{
                if(count>consecutive){
                    consecutive=count;
                }
                count=0;
            }
        }
        if(count>consecutive){
                    consecutive=count;
                }
        return consecutive;
    }
}
