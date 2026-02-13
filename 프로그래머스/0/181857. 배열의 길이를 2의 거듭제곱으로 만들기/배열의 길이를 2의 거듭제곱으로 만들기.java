class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        
        int i = 1;
        
        while(i < n){
            i *= 2;
        }
        
        int[] ans = new int[i];
        
        for(int j = 0 ; j < i; j++){
            if(j > arr.length - 1) ans[j] = 0;
            else ans[j] = arr[j];
        }
        return ans;
    }
}