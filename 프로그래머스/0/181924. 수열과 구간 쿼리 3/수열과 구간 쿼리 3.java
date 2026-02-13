class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] q : queries){
            int i = q[0];
            int j = q[1];
            int tmp = arr[j];
            
            arr[j] = arr[i];
            arr[i] = tmp;
        }
        
        return arr;
    }
}