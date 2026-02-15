class Solution {
    public int maxVowels(String s, int k) {
        /**
        This is a fixed window size problem we can use SLIDING WINDOW APPROACH!
        NOTE: 
        We add the new character entering the window.
        We remove the old character leaving the window.
        From "bci" → "cii"
        leaving char = 'b' → not vowel → no change
        entering char = 'i' → vowel → +1
        You didn’t re-count all 3 characters.
        You adjusted only what changed.
        */
        int max = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            //Lets count and keep the vowels on the first window size
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
            //This will be max count
            max = count;
            for (int i = k; i < s.length(); i++) {

                if (isVowel(s.charAt(i))) {
                    count++;
                }

                if (isVowel(s.charAt(i - k))) {
                    count--;
                }

                max = Math.max(max, count);
            }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}