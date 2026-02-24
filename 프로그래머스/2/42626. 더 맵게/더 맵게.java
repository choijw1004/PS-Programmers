import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        for(int i : scoville) pq.add((long)i);
        int cnt = 0;
        
        while(pq.peek() < K){
            
            if(pq.size() <= 1) return -1;
            long i1 = pq.poll();
            long i2 = pq.poll();
            
            pq.add(i1 + (i2 * 2));
            cnt++;
        }
        
        return cnt;
    }
}