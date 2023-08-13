class RecentCounter {

Queue<Integer> time ;
   
    public RecentCounter() {
        time = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        time.add(t);
        int range = t-3000;
        while(time.peek()<range){
         time.remove();
        }
        return time.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */