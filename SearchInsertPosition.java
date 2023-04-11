class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
         
        for(i=0; i<nums.length && target>nums[i];i++){};
        return i;
    
    }
}