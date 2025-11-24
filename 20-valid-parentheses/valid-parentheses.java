class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char c : s.toCharArray()) {

            // If it's a closing bracket
            if (map.containsKey(c)) {
                char top = stack.isEmpty() ? '#' : stack.pop();
                if (top != map.get(c)) {
                    return false;
                }
            } 
            // If it's an opening bracket
            else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
