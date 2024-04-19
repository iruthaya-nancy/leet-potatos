class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxValue = 0;
        for(int candy : candies){
            maxValue = Math.max(maxValue,candy);
        }
        for(int candy : candies){
            if(candy+extraCandies>=maxValue){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}