import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int left = 0;
        int right = arr.length - 1;
        
        int idx = 0;
        
        for(int q : query){
            if(idx % 2 == 0) right = left + q;
            else left += q;
            
            idx++;
        }
        
        return Arrays.copyOfRange(arr,left,right+1);
    }
}