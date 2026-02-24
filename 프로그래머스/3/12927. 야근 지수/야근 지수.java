import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(var w : works){
            pq.add(w);
        }
        
        while(n-- > 0){
            int curr = pq.poll();
            pq.add(curr -1);
        }
        
        long ans = 0;
        
        while(!pq.isEmpty()){
            int curr = pq.poll();
            if(curr <= 0) continue; 
            ans += (curr * curr);
        }
        
        return ans;
    }
}