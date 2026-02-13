import java.util.*;

class Solution {
    private int[] makeArr(int[] arr){
        int[] newArr = arr.clone();
        
        for(int i = 0 ; i < newArr.length; i++){
            if(newArr[i] >= 50){
                if(newArr[i] % 2 == 0) newArr[i] /= 2;
            }
            else if(newArr[i] % 2 == 1) newArr[i] = (newArr[i] * 2) + 1;
        }
        return newArr;
    }
    public int solution(int[] arr) {
        int cnt = 0;
        
        while(true){
            int[] next = makeArr(arr);
            
            if(Arrays.equals(next,arr)) {
                return cnt;
            }
            
            cnt++;
            arr = next;
        }
        
    }
}