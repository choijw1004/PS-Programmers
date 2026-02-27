import java.util.*;

class Solution {
    //1357
    //2268
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int cnt = 0;
        int idx = 0;
        
        for(int j = 0 ; j < A.length; j++){
            if(B[j] > A[idx]){
                cnt++;
                idx++;
            }
        }
        return cnt;
    }
}