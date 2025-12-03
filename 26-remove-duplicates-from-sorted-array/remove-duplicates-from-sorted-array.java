class Solution {
    public int removeDuplicates(int[] nums) {
        /**
        we can't use the set because this code requires the in-place logic so no
        extra spaces and the variable.So we have to change in the input array
        In this we are iterating from 1 Because THE FIRST ELEMENT OF THE ARRAY WILL BE 
        ALWAYS SORTED.
         */
        int k = 1;
        for(int i = 1 ; i< nums.length ; i++){
            if(nums[i-1] != nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}