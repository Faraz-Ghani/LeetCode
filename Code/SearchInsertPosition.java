class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }

        // If we get here, then we did not find the target in the array
        // So, we need to find the index where the target should be inserted
        // First, we need to find the first element in the array that is greater than the target
        // We can do that by iterating through the array from the beginning
        // We will stop when we find an element that is greater than the target
        // We will increment i until the condition is false
        // Once the condition is false, we will return i
        for(i=0; i<nums.length && target>nums[i];i++){};
        return i;
    
    }
}