class RecentCounter {
    /**
    This is handled via Queue because when the first request comes in 
    That is processed and polled if t-3000 > val
    range [t-3000,t]
     */

    Queue<Integer> request;
    public RecentCounter() {
        request = new LinkedList<>();
    }
    
    public int ping(int t) {
        request.offer(t);
        // iterate the queue
        while(request.peek() < t-3000){
            request.poll();
        }
        return request.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */