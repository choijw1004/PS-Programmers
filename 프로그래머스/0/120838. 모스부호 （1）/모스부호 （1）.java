import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] moss = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashMap<String, Character> map = new HashMap<>();
        
        for(int i = 0 ; i < 26; i++){
            char c = (char)('a' + i);
            map.put(moss[i],c);
        }
        
        StringBuilder sb = new StringBuilder();
        String[] ms = letter.split(" ");
        
        for(var v : ms){
            sb.append(map.get(v));
        }
        
        return sb.toString();
    }
}