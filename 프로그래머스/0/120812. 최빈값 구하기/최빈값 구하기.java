import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(var n : array){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        
        List<Map.Entry<Integer,Integer>>list = new ArrayList<>(map.entrySet());
        
        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());
        
        if(list.size() == 1) return list.get(0).getKey();
        return list.get(0).getValue() == list.get(1).getValue()
            ? -1
            : list.get(0).getKey();
    }
}