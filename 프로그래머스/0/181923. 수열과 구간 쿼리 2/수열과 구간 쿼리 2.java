import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
         List<Integer> list = new ArrayList<>();
        for(int[] q : queries){
            int start = q[0];
            int end = q[1];
            int k = q[2];
            int min = Integer.MAX_VALUE;
            int idx = -1;
           
            
            for(int i = start; i <= end; i++){
                if(arr[i] > k ){
                    if(arr[i] - k <= min){
                        idx = i;
                        min = arr[i] - k;
                    }
                }
            }
            if(idx != -1 ){
                list.add(arr[idx]);
                }
            else list.add(-1);
        }
        
        int[] ans = new int[list.size()];
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}