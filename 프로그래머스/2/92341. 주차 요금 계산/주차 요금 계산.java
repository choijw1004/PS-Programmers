import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        // 차량 번호와 시간을 담은 map
        HashMap<String, Integer> map1 = new HashMap<>();
        // 차량 번호와 누적 시간 담은 map
        HashMap<String, Integer> map2 = new HashMap<>();
        
        for(String record: records){
            //05:34 5961 IN
            String[] split = record.split(" ");
            String[] tp = split[0].split(":");
            int time = Integer.parseInt(tp[0]) * 60 + Integer.parseInt(tp[1]);
            
            if(split[2].equals("IN")){
                map1.put(split[1], time);    
            }
            else{
                map2.put(split[1], map2.getOrDefault(split[1], 0) + time - map1.get(split[1]));
                map1.remove(split[1]);
            }
        }
        
        for(Map.Entry<String, Integer> entry : map1.entrySet()){
            //map2에 1159 - 시간 put
            String name = entry.getKey();
            int val = entry.getValue();
            
            map2.put(name, map2.getOrDefault(name, 0) + ((23 * 60) + 59) - val);
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map2.entrySet());
        
        Collections.sort(list, (a,b) -> Integer.compare(Integer.parseInt(a.getKey()),Integer.parseInt(b.getKey())));
        
        int[] ans = new int[list.size()];
        
        for(int i = 0 ; i < ans.length; i++){
            int fee = 0;
            int time = list.get(i).getValue();
            
            if(time <= fees[0]){
                ans[i] = fees[1]; 
                continue;
            }
            
            fee += fees[1];
            
            fee += ((time - fees[0] + fees[2] - 1) / fees[2]) * fees[3];
            
            ans[i] = fee;
        }
        return ans;
    }
}