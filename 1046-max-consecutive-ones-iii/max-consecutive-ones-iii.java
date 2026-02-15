class Solution {
    public int longestOnes(int[] nums, int k) {
        /**
        TO SOLVE
        1. Important keyword is consecutive , so we need to maintain the order. 
        2. we are taking the count of zeros [since that need to be replaced], and we 
        are checking if that count < k if not reduce the zeroCounts and move left
         */
        int left = 0;
        int zeros = 0;
        int maxLen = 0;
        for(int right =0;right<nums.length;right++){
            if(nums[right] == 0){
                zeros++;
            }
            while(zeros>k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}