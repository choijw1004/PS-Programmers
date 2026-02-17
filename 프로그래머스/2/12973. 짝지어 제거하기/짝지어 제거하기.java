import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for(var c : s.toCharArray()){
            if(stack.isEmpty()) stack.push(c);
            
            //비어있지 않고
            else{
                if(stack.peek() == c){
                    stack.pop();
                }
                else{
                    stack.push(c);
                }
            }
        }
        
        return stack.size() == 0 
            ? 1 
            : 0;
    }
}