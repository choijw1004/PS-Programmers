import java.util.*;

class Solution {
    public String solution(String s) {
        char[] tmp = s.toCharArray();
        
        Arrays.sort(tmp);
        
        StringBuilder sb = new StringBuilder();
        
        for(var c : tmp){
            sb.append(c);
        }
        
        return sb.reverse().toString();
    }
}