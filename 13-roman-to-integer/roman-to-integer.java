class Solution {
    public int romanToInt(String s) {
        int[] romanVal = new int[128];
        /*
        Assigning to the ascii value because this have the faster look up as the java will 
        have the character for each value
        refer asci table
        */
        romanVal['I'] = 1;
        romanVal['V'] = 5;
        romanVal['X'] = 10;
        romanVal['L'] = 50;
        romanVal['C'] = 100;
        romanVal['D'] = 500;
        romanVal['M'] = 1000;

        int total = 0;

    //subract if the smaller value is first and the larger value
    for(int i = 0;i<s.length();i++){
            int current = romanVal[s.charAt(i)];
            if(i+1 < s.length() && current < romanVal[s.charAt(i+1)])
            {
                total -= current;
            }
            else{
                total += current;
            }
    }
        return total;
    }
}