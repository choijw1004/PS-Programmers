import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> map = new HashMap<>();
        
        for(var p : participant){
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for(var c : completion){
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        
        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i).getValue() > 0) return list.get(i).getKey();
        }
        
        return "";
    }
}