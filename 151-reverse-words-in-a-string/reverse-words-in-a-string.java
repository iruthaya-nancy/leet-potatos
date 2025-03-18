class Solution {
    public String reverseWords(String s) {
        char[] charArray = s.trim().toCharArray();

        reverse(charArray, 0, charArray.length - 1);

        int start = 0;
        for (int end = 0; end < charArray.length; end++) {
            if (charArray[end] == ' ') {
                reverse(charArray, start, end - 1);
                start = end + 1;
            }
        }
        // Reverse the last word
        reverse(charArray, start, charArray.length - 1);

        // Step 3: Remove extra spaces and fix spacing
        return cleanSpaces(charArray);
    }

    private void reverse(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    private String cleanSpaces(char[] s) {
        int i = 0, j = 0;
        while (j < s.length) {
            while (j < s.length && s[j] == ' ') j++;  // Skip leading spaces
            while (j < s.length && s[j] != ' ') s[i++] = s[j++]; // Copy word
            while (j < s.length && s[j] == ' ') j++;  // Skip extra spaces
            if (j < s.length) s[i++] = ' '; // Add single space if more words exist
        }
        return new String(s, 0, i); // Return the processed string
    }
}
