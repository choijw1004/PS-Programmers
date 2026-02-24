import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = numbers.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                ans[stack.pop()] = numbers[i];
            }    
            
            stack.push(i);
        }
        
        return ans;
        
    }
}