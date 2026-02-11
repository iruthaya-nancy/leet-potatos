class Solution {
    public int compress(char[] chars) {
        /**
        APPROACH:
        1. Iterate throught the chars array and keep the temporary variable for char
        and the count when the previous character doesn't match break the loop and add the character and the count as each
        value
        2. Also instructed to use the input character array so we are using the
        TWO POINTER APPROACE which starts from the same direction*/
        int read = 0;
        int write = 0;
        while(read < chars.length){
            char current  = chars[read];
            int count = 0;
            while(read < chars.length && current == chars[read]){
                read++;
                count++;
            }
            chars[write++]  = current;
            if(count > 1){
                String val = String.valueOf(count);
                for(char c: val.toCharArray()){
                    chars[write++] = c;
                }
            } 
        }
        return write;

    }
}