import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        
        // 빈도수 오름 차순
        Collections.sort(list, (x,y) -> {
            if(x.getValue() == y.getValue()) return x.getKey() - y.getKey();
            return x.getValue() - y.getValue();
        });
        
        if(list.size() == 1){
            return a * 1111;
        }
        else if(list.size() == 2){
            if(list.get(0).getValue() == 1){
                
                
                return (int) Math.pow(10 * list.get(1).getKey() + list.get(0).getKey(), 2);
            }
            
            else if(list.get(0).getValue() == list.get(1).getValue()){
                return Math.abs(list.get(0).getKey() - list.get(1).getKey()) * (list.get(0).getKey() + list.get(1).getKey());
            }
        }
        else if(list.size() == 3){
            return list.get(0).getKey() * list.get(1).getKey();
        }
        else{
            return list.get(0).getKey();
        }
        
        return 0;
    }
}