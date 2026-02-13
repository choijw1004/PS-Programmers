class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] pre = new int[arr.length + 1];
        for(int[] q : queries){
            pre[q[0]] ++;
            
            if(q[1] + 1 < arr.length) pre[q[1] + 1]--;
        }
        
        int sum = 0;
        
        for(int i = 0 ; i < arr.length; i++){
            sum += pre[i];
            arr[i] += sum;
        }
        
        return arr;
    }
}