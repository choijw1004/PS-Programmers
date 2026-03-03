import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] ans = new int[id_list.length];
        HashMap<String, List<String>> g = new HashMap<>();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        Set<String> set = new HashSet<>();
        Set<String> isb = new HashSet<>();
        
        for(var i : id_list){
            map.put(i,0);
        }
        
        for(var rep : report){
            if(set.contains(rep)) continue;
            
            set.add(rep);
            String[] s = rep.split(" ");
            String from = s[0];
            String to = s[1];
            
            g.computeIfAbsent(from , key -> new ArrayList<>()).add(to);
            
            map.put(to, map.getOrDefault(to, 0) + 1);
        }
        
        for(var e : map.entrySet()){
            if(e.getValue() >= k) isb.add(e.getKey());
        }
        int idx = 0;
        
        for(var id : id_list){
            List<String> tmp = g.getOrDefault(id, new ArrayList<>());
            int cnt = 0;
            for(int i = 0; i < tmp.size(); i++){
                if(isb.contains(tmp.get(i))) cnt++;
            }
            ans[idx] = cnt;
            idx++;
        }
        
        return ans;
    }
}