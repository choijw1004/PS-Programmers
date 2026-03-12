import java.util.*;

class Solution {
    public String solution(String number, int k) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int rm = 0;
        
        for(var c: number.toCharArray()){
            int num = c - '0';
            
            while(rm < k && !stack.isEmpty() && stack.peek() < num){
                stack.pop();
                rm++;
            }
            stack.push(num);
        }
        
        while(rm < k){
            stack.pop();
            rm++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.append(Integer.toString(stack.pop()));
        }
        
        return sb.reverse().toString();
    }
}