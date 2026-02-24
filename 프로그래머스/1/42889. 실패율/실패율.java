import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();
        
        for(int i = 1; i <=N; i++){
            int top = 0;
            int bot = 0;
            
            for(int stage : stages){
                
                if(stage >= i){
                    bot++;
                    if(stage == i) top++;
                }    
            }
            if(bot == 0 || top == 0) map.put(i, 0.0);
            else map.put(i, (double)top / bot);
        }
        
        List<Map.Entry<Integer,Double>> list = new ArrayList<>(map.entrySet());
        
        Collections.sort(list, (a,b)-> {
            if(a.getValue() == b.getValue()) return a.getKey() - b.getKey();
            else return Double.compare(b.getValue(), a.getValue());
        });
        
        int[] ans = new int[list.size()];
        
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}