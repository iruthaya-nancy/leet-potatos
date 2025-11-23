/**
Take complement of the values with the target and see that value is present in the map where the key is complement or the array
value and the map value is the index

 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> complementMap = new HashMap<>();
        for(int i = 0 ; i< nums.length;i++){
            int comp = target - nums[i];
            if(complementMap.containsKey(comp)){
                return new int[]{complementMap.get(comp),i};
            }
            complementMap.put(nums[i],i);
        }
        return new int[]{};
    }
}