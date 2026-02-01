class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
          int complement = k-nums[i];
          if(map.getOrDefault(complement,0) > 0){
            count++;
            map.put(complement,map.get(complement)-1);
          }
          else{
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
          }
        }
        return count;
    }
}