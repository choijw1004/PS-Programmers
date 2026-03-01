import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        HashSet<String> set = new HashSet<>();
        List<int[]> list = new ArrayList<>();
        for(var g : gems) set.add(g);
        
        int stan = set.size();
        
        HashMap<String, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int n = gems.length;
        
        while(end < n){
            map.put(gems[end], map.getOrDefault(gems[end], 0) + 1);
            end++;
            
            //만족할 떄까지 줄이기 
            
            while(map.size() == stan){
                list.add(new int[]{start + 1,end});
                
                map.put(gems[start], map.getOrDefault(gems[start], 0) -1);
                if(map.get(gems[start]) <= 0) map.remove(gems[start]);
                
                start++;
            }
        }
        
        Collections.sort(list, (a,b) ->{
            int la = a[1] - a[0];
            int lb = b[1] - b[0];
            
            if(la == lb) return a[0] - b[0];
            else return la - lb;
        });
        
        return list.get(0);
    }
}