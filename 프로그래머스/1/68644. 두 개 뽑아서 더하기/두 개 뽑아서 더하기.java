import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n; j++){
                if(i != j) set.add(numbers[i] + numbers[j]);
            }
        }
        
        
        int[] ans = new int[set.size()];
        
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = set.pollFirst();
        }
        
        return ans;
    }
}