import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(var op : operations){
            String[] t = op.split(" ");
            int num = Integer.parseInt(t[1]);

            if(t[0].equals("I")){
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else if(!map.isEmpty()){
                if(num == 1){
                    int hi = map.lastKey();
                    map.put(hi, map.get(hi) - 1);
                    if(map.get(hi) <= 0) map.remove(hi);
                } else {
                    int lo = map.firstKey();
                    map.put(lo, map.get(lo) - 1);
                    if(map.get(lo) <= 0) map.remove(lo);
                }
            }
        }
        
        return map.size() == 0 
            ? new int[]{0,0}
            : new int[]{map.lastKey(),map.firstKey()};
    }
}