class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> val = new Stack<>();
        for(int a : asteroids){
            boolean alive = true;
            while(alive && a < 0 && !val.isEmpty() && val.peek() > 0){
                int top = val.peek();
                if(top < -a){
                    //collision remve the smaller value
                    val.pop();
                }
                else if(top == -a){
                    //entire collision
                    alive = false;
                    val.pop();
                }
                else{
                    alive = false; // |a| modular case
                }
            }

                if(alive){
                    val.push(a);
                }
        }
                
        // Convert stack to array
        int[] result = new int[val.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = val.pop();
        }
        return result;
    }
}