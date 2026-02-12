import java.util.*;

class Solution {
    public int solution(String number) {
        int sum = 0;
        
        for(var c : number.toCharArray()){
            sum += c - '0';    
        }
        
        return sum % 9;
    }
}