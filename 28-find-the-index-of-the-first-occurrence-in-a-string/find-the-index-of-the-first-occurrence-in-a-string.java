class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if(n>h) return -1;
        if(n==0) return 0;
        //subracting h-n because the first occurence will occure between the length among the haystack
        for(int i = 0; i<=h-n ;i++){
            //need element J because i want to iterate to the size of the needle
            int j = 0;
            while(j<n && haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if(j==n) return i; //returnin i because we need the first index
        }
        return -1;
    }
}