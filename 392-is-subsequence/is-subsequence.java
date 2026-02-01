class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] charArray = s.toCharArray();
        int temp = -1;
        for(int i = 0 ; i<charArray.length;i++){
              if(!t.contains(String.valueOf(charArray[i]))){
                return false;
              }
              int nextIndex =  t.indexOf(charArray[i],temp+1);
              if(nextIndex == -1 || nextIndex < temp ){
                return false;
              }
              temp = nextIndex;
        }
        return true;
    }
}