import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        
        List<String> list = new ArrayList<>();
        
        for(String s : picture){
            StringBuilder sb = new StringBuilder();
            
            for(int i = 0 ; i < s.length(); i++){
                for(int j = 0 ; j < k; j++){
                    sb.append(s.charAt(i));                    
                }
            }
            
            for(int i = 0 ; i < k; i++){
                list.add(sb.toString());
            }
        }
        
        String[] res = new String[list.size()];
        
        for(int i = 0 ; i < res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}