import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(var n : num_list){
            String s = Integer.toString(n);
            
            if(n % 2 == 0) sb1.append(s);
            else sb2.append(s);
        }
        
        return Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
    }
}