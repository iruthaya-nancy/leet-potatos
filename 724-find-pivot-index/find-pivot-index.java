class Solution {
    public int pivotIndex(int[] nums) {
        /**
        To balance the left and right index and to know the sum instantly we
        need to use the prefix sum 
         */
         int total = 0;
         int left = 0;
         for(int val : nums){
            total+=val;
         }
         for(int i = 0 ; i< nums.length;i++){
            int rightSum = total-left-nums[i];
         if(rightSum==left){
            return i;
         }
         left+=nums[i];
         }
         return -1;
    }
}