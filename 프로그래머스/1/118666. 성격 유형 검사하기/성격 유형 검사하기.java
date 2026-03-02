import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i < survey.length; i++){
            String op = survey[i];
            int c = choices[i];
            
            char left = op.charAt(0);
            char right = op.charAt(1);
            
            if(c == 1){
                map.put(left, map.getOrDefault(left,0) + 3);
            }
            else if(c == 2){
                map.put(left, map.getOrDefault(left,0) + 2);
            }
            else if(c == 3){
                map.put(left, map.getOrDefault(left,0) + 1);
            }
            else if(c == 4){
                continue;
            }
            else if(c == 5){
                map.put(right, map.getOrDefault(right,0) + 1);
            }
            else if(c == 6){
                map.put(right, map.getOrDefault(right,0) + 2);
            }
            else if(c == 7){
                map.put(right, map.getOrDefault(right,0) + 3);
            }
        }
        StringBuilder sb = new StringBuilder();
        
        int nr = map.getOrDefault('R', 0);
        int nt = map.getOrDefault('T', 0);
        if(nr >= nt) sb.append('R');
        else sb.append('T');
        
        int nc = map.getOrDefault('C', 0);
        int nF = map.getOrDefault('F', 0);
        if(nc >= nF) sb.append('C');
        else sb.append('F');
        
        int nj = map.getOrDefault('J', 0);
        int nm = map.getOrDefault('M', 0);
        if(nj >= nm) sb.append('J');
        else sb.append('M');
        
        int na = map.getOrDefault('A', 0);
        int nn = map.getOrDefault('N', 0);
        if(na >= nn) sb.append('A');
        else sb.append('N');
        
        return sb.toString();
    }
}