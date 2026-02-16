import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        //number = rank
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < rank.length; i++){
            map.put(i,rank[i]);
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        
        Collections.sort(list,(a,b)-> a.getValue() - b.getValue());
        
        int cnt = 0;
        int[] ans = new int[3];
        
        for(int i = 0 ; i < list.size(); i++){
            if(attendance[list.get(i).getKey()]){
                ans[cnt] = list.get(i).getKey();
                cnt++;
            }
            
            if(cnt == 3) break;
        }
        
        return (ans[0] * 10000) + (ans[1] * 100) + ans[2];
    }
}