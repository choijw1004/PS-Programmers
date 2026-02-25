import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> set = new HashSet<>();
        
        for(var c : skip.toCharArray()){
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        
        for(var c : s.toCharArray()){
            int cnt = 0;
            char nc = c;
            
            while(true){
                nc += 1;
                
                if(nc > 'z') nc = 'a';
                
                if(!set.contains((char)nc)){
                    cnt++;
                }
                
                if(cnt == index) break;
            }
            sb.append(nc);
        }
        return sb.toString();
    }
}