class Solution {
    public double findMaxAverage(int[] nums, int k) {
        /**
        To find the max average with the window size of k
        1.  Sum the values till the k length
        2. Then for the iteration intermediate values will be same and only one value will be added
        and one will be removed 
        NOTE :  when ever we are taking sum try to reuse that instead of going for
        another iteration*/
        int sum = 0;
        for(int i = 0; i<k;i++ ){
            sum += nums[i];
        }

        int maxVal = sum;
        for(int i = k ; i< nums.length;i++){
            sum = sum - nums[i-k]+nums[i];
            maxVal = Math.max(sum,maxVal);
        }

        return (double)maxVal/k;
    }
}