class Solution {
    private boolean isH(int h, int[] c){
        int cnt = 0;
        for(var x : c){
            if(x >= h) cnt++;
        }
        return cnt >= h;
    }
    public int solution(int[] citations) {
        int max = -1;
        
        for(var c : citations){
            max = Math.max(max, c);
        }
        
        int left = 0;
        int right = max;
        int ans = 0;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(isH(mid,citations)){
                ans = mid; 
                left = mid + 1;
            }
            else right = mid -1;
        }
        
        return ans;
    }
}