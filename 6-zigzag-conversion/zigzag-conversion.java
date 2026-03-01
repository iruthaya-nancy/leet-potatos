class Solution {
    public String convert(String s, int numRows) {
        /**
        As the example defines this will have the 3 bucket of row in list
        zigzag will have the center value.
         */
         List<StringBuilder> rowBucket = new ArrayList<>();
         for( int i = 0 ;i<numRows;i++){
            rowBucket.add(new StringBuilder());//creates bucket;
         }

         //handle the empty condition
         if(numRows == 1 || s.length() <= numRows){
            return s;
         }
         //logic -> going down based on the index
         int current = 0;
         boolean isGoingDown = false;
         for(char c : s.toCharArray()){
                rowBucket.get(current).append(c);
                if(current == 0 || current == numRows-1){
                    isGoingDown = !isGoingDown;
                }
                current += isGoingDown ? 1 : -1; //based on this add 1 to go down
         }
         StringBuilder result = new StringBuilder();
         for(StringBuilder k : rowBucket){
            result.append(k);
         }
         return result.toString();
    }
}