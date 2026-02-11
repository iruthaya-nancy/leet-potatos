class Solution {
    public int[] productExceptSelf(int[] nums) {
        /**
        TO SOLVE THIS:
        1. Use a single array take the product of the each values from the left and then
        iterate the array again and multiply with the right array
        */
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = 1;
        for(int i = 1; i< n;i++){
            answer[i] = answer[i-1]*nums[i-1];
        }
        int right = 1;
        for(int i = nums.length-1 ; i >=0 ;i--){
            answer[i] *= right;
            right *= nums[i];
        }
        return answer;
    }
}