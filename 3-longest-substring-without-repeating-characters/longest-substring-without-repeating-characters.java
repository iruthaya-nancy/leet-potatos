class Solution {
    public int lengthOfLongestSubstring(String s) {
        /**
          To avoid the duplicate characters we can use the hashset
         */
        HashSet<Character> value = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for(int r = 0 ; r<s.length();r++){
            while(value.contains(s.charAt(r))){
                value.remove(s.charAt(left));
                left++;
            }
            value.add(s.charAt(r));
            maxLen = Math.max(maxLen,r-left+1);
        } 
        return maxLen;
    }
}