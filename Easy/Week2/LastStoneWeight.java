import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : stones) {
            pq.add(n);
        }

        while(pq.size() > 1) {
            int num1 = pq.poll();
            int num2 = pq.poll();

            if(num2 != num1) {
                pq.offer(num1 - num2);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}
}
