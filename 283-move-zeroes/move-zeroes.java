class Solution {
    public void moveZeroes(int[] nums) {
        /**
        Keep an index to track where the index need to be added.
        1. Move all the non-zero elements to the left 
        2. Then compare the write index with the size of the array and add zeros to the
        remaining place
         */
         int writeIndex = 0;
         for(int i = 0 ; i< nums.length ; i++){
            if(nums[i]!=0){
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
         }

         while(writeIndex < nums.length){
            nums[writeIndex] = 0;
            writeIndex++;
         }
    }
}