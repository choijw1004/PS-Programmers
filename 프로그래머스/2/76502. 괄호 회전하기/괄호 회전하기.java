import java.util.*;
class Solution {
    private boolean isValid(String tmp){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        for(var c : tmp.toCharArray()){
            if(c == '[' || c == '{' || c == '(') stack.push(c);
            
            else if (c == ')'){
                if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else return false;
            }
            else if (c == ']'){
                if(!stack.isEmpty() && stack.peek() == '[') stack.pop();
                else return false;
            }
            else 
                if(!stack.isEmpty() && stack.peek() == '{') stack.pop();
                else return false;
        }
        
        return stack.size() == 0 
            ? true
            : false;
    }
    public int solution(String s) {
        int n = s.length();
        int cnt = 0;
        
        for(int i = 0 ; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < i + n; j++){
                sb.append(s.charAt(j % n));
            }
            if(isValid(sb.toString())) cnt++;
        }
        
        return cnt;
    }
}