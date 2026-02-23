import java.util.*;

class Solution {
    public int solution(int[] topping) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        
        for(var t : topping){
            map.put(t,map.getOrDefault(t,0) + 1);
        }
        
        for(var t : topping){
            set.add(t);
            
            map.put(t,map.getOrDefault(t,0) - 1);
            
            if(map.get(t) <= 0) map.remove(t);
            if(set.size() == map.size())cnt++;
        }
        return cnt;
    }
}