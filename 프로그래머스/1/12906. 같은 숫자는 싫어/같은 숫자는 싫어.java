import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(var i : arr){
            if(stack.isEmpty()) stack.push(i);
            
            else{
                if(i == stack.peek()) continue;
                else stack.push(i);
            }
        }
        
        int[] ans = new int[stack.size()];
        
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = stack.get(i);
        }
        return ans;
    }
}