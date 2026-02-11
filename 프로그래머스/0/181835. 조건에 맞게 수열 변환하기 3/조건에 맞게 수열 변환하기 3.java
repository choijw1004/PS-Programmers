class Solution {
    public int[] solution(int[] arr, int k) {
        int[] ans = new int[arr.length];
        
        for(int i = 0 ; i < ans.length; i++){
            if(k % 2 == 1){
                ans[i] = arr[i] * k;
            }
            else ans[i] = arr[i] + k; 
        }
        
        return ans;
    }
}