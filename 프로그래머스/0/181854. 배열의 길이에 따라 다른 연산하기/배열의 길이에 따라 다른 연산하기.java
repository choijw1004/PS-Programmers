class Solution {
    public int[] solution(int[] arr, int n) {
        int k = arr.length;
        
        for(int i = 0 ; i < k; i++){
            if(k % 2 == 0){
                if(i % 2 != 0) arr[i] += n;
            }
            else{
                if(i% 2 == 0) arr[i] += n;
            }
        }
        
        return arr;
    }
}