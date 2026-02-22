class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> value = new HashMap<>();
        for(int i : arr){
            if(value.containsKey(i)){
                value.put(i,value.getOrDefault(i,0)+1);
            }
            else{
                value.put(i,1);
            }
        }
        Set<Integer> set = new HashSet<>(value.values());
        if(set.size() == value.values().size()){
            return true;
        }
        return false;
    }
}