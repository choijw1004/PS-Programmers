import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] t1 = new int[10];
        int[] t2 = new int[10];
        
        for(var c : X.toCharArray()){
            t1[c - '0']++;
        }
        
        for(var c : Y.toCharArray()){
            t2[c - '0']++;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 10; i++){
            if(t1[i] == 0 || t2[i] == 0) continue;
            
            int cnt = Math.min(t1[i], t2[i]);
            
            for(int j = 0 ; j < cnt; j++){
                list.add(i);
            }
        }
        
        if(list.size() == 0) return "-1";
        Collections.sort(list);
        if(list.get(list.size() - 1) == 0) return "0";
        StringBuilder sb = new StringBuilder();
        
        for(int i = list.size() - 1; i >= 0; i--){
            sb.append(list.get(i));
        }
        
        return sb.toString();
        
    }
}