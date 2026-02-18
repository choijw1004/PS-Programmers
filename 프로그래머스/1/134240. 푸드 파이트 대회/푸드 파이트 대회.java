import java.util.*;

class Solution {
    public String solution(int[] food) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++){
            int cnt = food[i];
            
            if(cnt % 2 == 1){
                cnt -= 1;
            }
            
            for(int j = 0; j < cnt / 2; j++){
                stack.push(i);
                sb.append(Integer.toString(i));
            }
        }
        
        sb.append("0");
        
        while(!stack.isEmpty()){
            sb.append(Integer.toString(stack.pop()));
        }
        
        return sb.toString();
    }
}