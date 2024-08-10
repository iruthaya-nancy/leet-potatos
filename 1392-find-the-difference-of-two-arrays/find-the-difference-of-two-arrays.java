class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //to avoid duplicate use set
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        // to add the array in set
        for(int i : nums1){
            set1.add(i);
        }
        for(int j : nums2){
            set2.add(j);
        }

        //removed list
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i : set1){
            if(!set2.contains(i)){
                list1.add(i);
            }
        }

        for(int j : set2){
            if(!set1.contains(j)){
                list2.add(j);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        return result;
    }
    
}