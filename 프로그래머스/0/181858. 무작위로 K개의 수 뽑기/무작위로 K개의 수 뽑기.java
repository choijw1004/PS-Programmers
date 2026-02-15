import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] ans = new int[k];
        HashSet<Integer> set = new HashSet<>();
        Arrays.fill(ans, -1);
        
        int kIdx = 0;
        
        for(int i = 0 ; i < arr.length; i++){
            if(set.contains(arr[i])) continue;
            
            set.add(arr[i]);
            ans[kIdx] = arr[i];
            
            kIdx++;
            
            if(kIdx == k) break;
        }
        return ans;
    }
}