import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] ans = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            //cache size = k
            if(pq.size() < k){
                pq.add(score[i]);
            }
            // cache size > k 
            else{
                int low = pq.peek();
                if(score[i] > low){
                    pq.poll();
                    pq.add(score[i]);
                }
            }
            
            ans[i] = pq.peek();
        }
        return ans;
    }
}