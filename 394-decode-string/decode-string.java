class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        //Processing with string builder for the append function
        Stack<StringBuilder> res = new Stack<>();
        int k = 0;
        StringBuilder current = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                //we are converting it to the int value using the ascii
                k = k*10+(c-'0');
            }
            else if(c == '['){
                count.push(k);
                res.push(current);
                current = new StringBuilder();
                k = 0;
            }
            else if( c == ']'){
                int n = count.pop();
                StringBuilder prev = res.pop();
                for(int i = 0;i<n;i++){
                    prev.append(current);
                }
                current = prev;
            }
            else{
                current.append(c);
            }
        }

        return current.toString();
    }
}