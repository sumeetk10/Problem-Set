package Medium.Week1;

import java.util.PriorityQueue;

public class AliceHand {
    class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : hand) {
            pq.add(x);
        }

        while(!pq.isEmpty()) {
            int curr = pq.poll();
            for(int i=1; i<groupSize; i++) {
                if(!pq.remove(curr+i)) return false;
            }
        }
        
        return true;
    }
}
}
