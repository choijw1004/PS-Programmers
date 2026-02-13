class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] q : queries){
            int start = q[0];
            int end = q[1];
            int k = q[2];
            
            for(int i = start; i <= end; i++){
                if(i % k == 0) arr[i]++;
            }
        }
        
        return arr;
    }
}