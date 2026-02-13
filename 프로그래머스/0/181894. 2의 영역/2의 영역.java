class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 2){
                if(start == -1) {
                    start= i;
                }
                end = i;
            } 
        }
        
        if(end == -1) return new int[]{-1};
        
        int[] ans = new int[end - start + 1];
        
        for(int i = start; i <= end; i++){
            ans[i - start] = arr[i];
        }
        return ans;
    }
}