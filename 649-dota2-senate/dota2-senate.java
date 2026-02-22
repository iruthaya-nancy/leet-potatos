class Solution {

    public String predictPartyVictory(String senate) {
        /**
        Each senator:
            Bans one opponent
            Survives to the next round
            So you need to:
            Track pending bans
            Allow surviving senators to re-enter the queue
            This is why many people fail this problem.
         */
        Queue<Character> queue = new LinkedList<>();
        int banR = 0;
        int banD = 0;
        int countR = 0;
        int countD = 0;
        //put everything in the queue
        for(char c : senate.toCharArray()){
            queue.offer(c);
            if(c == 'R') 
            {
                countR++;
            }
            else{
                countD++;
            }
        }
        while(countR > 0 && countD > 0){
            // poll the queueu
            char current = queue.poll();
            if(current == 'R'){
                if(banR>0){
                countR--;
                banR--;
                }
                else{
                    banD++;
                    queue.offer(current);
                }
            }
            else{
                if(banD >  0){
                    banD--;
                    countD--;
                }
                else{
                    banR++;
                    queue.offer(current);
                }
            }
        }

        return countR > 0 ? "Radiant" : "Dire";
    }
}