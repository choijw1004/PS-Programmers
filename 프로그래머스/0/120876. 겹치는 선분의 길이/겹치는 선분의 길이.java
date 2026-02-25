import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        
        for(int[] line : lines){
            line[0] += 100;
            line[1] += 100;
        }
        
        int[] arr = new int[201];
        
        for(int[] line : lines){
            for(int i = line[0]; i < line[1]; i++){
                arr[i]++;
            }
        }
        
        int cnt = 0;
        
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] >= 2) cnt++;    
        }
        
        return cnt;
    }
}