import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> imap = new HashMap<>();
        for(int i = 0 ; i < players.length; i++){
            map.put(players[i], i + 1);
            imap.put(i + 1, players[i]);
        }
        
        for(var c : callings){
            //현재 등수
            int curr = map.get(c);
            
            //이전 선수 접근
            String prev = imap.get(curr-1);
            
            //이전 ++ 현재(c) -- 
            
            map.put(prev, map.getOrDefault(prev, 0) +1);
            map.put(c, map.getOrDefault(c, 0) -1);
            imap.put(curr -1 , c);
            imap.put(curr, prev);
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        
        Collections.sort(list, (a,b) -> a.getValue() - b.getValue());
        
        String[] ans = new String[list.size()];
        
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = list.get(i).getKey();
        }
        
        return ans;
    }
}