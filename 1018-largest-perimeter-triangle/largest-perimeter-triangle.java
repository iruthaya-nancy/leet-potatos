class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length-1; i>=2 ;i--){
            if(nums[i-2]+nums[i-1] > nums[i]){ //a + b > c is the triangle condition
                return nums[i-2]+nums[i-1]+nums[i];
            }
        }
        return 0;
    }
}