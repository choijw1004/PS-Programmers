import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        
        for(var c : cards1){
            q1.add(c);
        }
        
        for(var c : cards2){
            q2.add(c);
        }
        
        for(var c : goal){
            if(!q1.isEmpty()&& q1.peek().equals(c)){
                q1.poll();
                continue;
            }
            
            else if(!q2.isEmpty()&& q2.peek().equals(c)){
                q2.poll();
                continue;
            }
            else {
                return "No";
            }
        }
        return "Yes";
    }
}