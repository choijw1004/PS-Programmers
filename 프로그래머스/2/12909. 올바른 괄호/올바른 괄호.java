import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(var c : s.toCharArray()){
            
            if(c == '(') stack.push(c);
            
            else{
                if(stack.isEmpty()) return false;
                
                if(stack.peek() == '(') stack.pop(); 
            } 
        }
        
        return stack.size() == 0
            ? true
            : false;
    }
}