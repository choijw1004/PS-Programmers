class Solution {
    public int solution(int[] cookie) {
        int n = cookie.length;
        int ans = -1;
        
        //분할점 d
        for(int d = 0; d < n-1; d++){
            int l = d;
            int r = l + 1;
            int left = cookie[l];
            int right = cookie[r];
            
            while(true){
                if(left == right){
                    ans = Math.max(left, ans);
                    if(l == 0 || r == n-1) break; 
                    
                    left += cookie[--l];  
                    right += cookie[++r];
                }    
                else if(left < right){
                    l--;
                    if(l == -1) break;
                    left += cookie[l];
                }
                else{
                    r++;
                    if(r == n) break;
                    right += cookie[r];
                }
            }
        }
        return ans == -1
            ? 0
            : ans;
    }
}