import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        int i = 0;
        
        while(i < arr.length){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                i++;
                continue;
            }
            
            else if(!stack.isEmpty() && stack.peek() < arr[i]){
                stack.push(arr[i]);
                i++;
                continue;
            }
            
            else if(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
                continue;
            }
        }
        
        int[] ans = new int[stack.size()];
        
        for(int j = ans.length -1; j >= 0; j--){
            ans[j] = stack.pop();
        }
        return ans;
    }
}