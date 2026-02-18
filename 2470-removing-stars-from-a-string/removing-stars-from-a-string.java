class Solution {
    public String removeStars(String s) {
        /**
            TO DO:
            1.Convert string to stringbuilder.
            2.iterate the string and push in stack
            3.when the word is * pop from the stack
            4.print the final stack.
         */
        Stack<Character> result = new Stack<>();
        char[] words = s.toCharArray();
        for(int i=0;i<words.length;i++){
            if(words[i]!= '*'){
                result.push(words[i]);
            }else{
                result.pop();
            }
        }
        //string builder to convert into string
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<result.size();i++){
            sb.append(result.get(i));
        }
        return sb.toString();
    }
}