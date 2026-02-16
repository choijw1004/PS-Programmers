import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        HashSet<Character> set = new HashSet<>();
        boolean found = false;
        
        for(int i = 0; i < spell.length; i++){
            set.add(spell[i].charAt(0));    
        }
        
        for(String s : dic){
            boolean can = true;
            
            if(s.length() != spell.length) continue;
            
            HashSet<Character> tmp = new HashSet<>();
            
            for(char c : s.toCharArray()){
                tmp.add(c);
            }
            
            if(tmp.equals(set)) return 1;
        }
        return 2;
    }
}