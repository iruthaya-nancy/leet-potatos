class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxVal = 0;
        for(int i = 0 ; i< gain.length;i++){
            sum+=gain[i];
            maxVal = Math.max(maxVal,sum);
        }
         return maxVal;
    }
}