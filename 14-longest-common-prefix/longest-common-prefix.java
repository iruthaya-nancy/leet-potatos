class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*
        It is recommended to sort the array before progressing and we have to 
        find the longest common prefix
        */
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        while(i<first.length() && i <last.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
}