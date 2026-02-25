import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(var key : keymap){
            for(int i = 0 ; i < key.length(); i++){
                //기존 키 위치, i 비교 
                char c = key.charAt(i);
                
                int old = map.getOrDefault(c,0);
                
                if(old == 0){
                    map.put(c, i + 1);
                }
                else{
                    map.put(c, Math.min(i + 1, old));
                }
            }
        
        }
            
        int[] ans = new int[targets.length];
            
        for(int i = 0 ; i < ans.length; i++){
            int sum = 0;

            for(var c : targets[i].toCharArray()){
                int tmp = map.getOrDefault(c, -1);
                if(tmp == -1) {
                    ans[i] = -1;
                    break;
                }

                sum += tmp;
            }
            if (ans[i] != -1) ans[i] = sum;
        }
        return ans;
    }
}