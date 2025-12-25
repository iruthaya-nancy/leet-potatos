class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        /**
        Greedy way: Sort the array in desc and pick the greater value and sum it.
        Subract by the index as it increases by 1 and maintaing seperate array is not recommeded as
        we dont need to keep track to compare.
         */
         Arrays.sort(happiness);
         int length = happiness.length;
         long sum = 0;
         int val = 0;
         for(int i = 0 ; i<k ; i++){
            val = happiness[length-1-i]-i;
            if(val > 0){
                sum += val;
            }
         }
         return sum;
    }
}