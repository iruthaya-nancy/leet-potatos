class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] words=s.toCharArray();
        //since we dont have the defined length we use while loop
        int l = 0;
        int r = words.length-1;
        while(l<r){
            if(!vowels.contains(words[l])){
                l++;
            }
            else if(!vowels.contains(words[r])){
                r--;
            }
            else{
                //swap the values
                char temp = words[l];
                words[l] = words[r];
                words[r] = temp;
                l++;
                r--;
            }
        }
        //return words.toString(); = > returns object 
        return new String(words);
    }
}