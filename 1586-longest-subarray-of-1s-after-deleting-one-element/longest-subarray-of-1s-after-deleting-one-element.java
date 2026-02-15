class Solution {
    public int longestSubarray(int[] nums) {
        /**
        Think like find the longest sub array with atmost one zero
        so take the zero count and when the zero count is > 1 reduce the size 
        and increment the left to set the start index and to find the final count
        here return [window size - 1]
         */
        int left = 0;
        int zeros = 0;
        int maxVal = 0;
        for(int right = 0 ;right < nums.length ; right++){
            if(nums[right] == 0){
                zeros++;
            }
            while(zeros >  1){
                //We are doing this because we are reiterating the array till 
                //the window size and incrementing the left index
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            maxVal = Math.max(maxVal,right-left);
        }
        return maxVal;
    }
    
}