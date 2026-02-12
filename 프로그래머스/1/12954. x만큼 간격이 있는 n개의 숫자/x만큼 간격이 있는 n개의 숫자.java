class Solution {
    public long[] solution(int x, int n) {
        long[] ans = new long[n];
        int idx = 0;
        long pl = x;
        
        while(true){
            if(idx == n) break;
            ans[idx] = pl;
            
            pl += x;
            idx++;
        }
        
        return ans;
    }
}