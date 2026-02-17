class Solution {
    public int solution(int n) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int cnt =0;
        
        while(end <= n){
            if(sum < n){
                end++;
                sum += end;
            }
            
            else if(sum == n){
                cnt++;
                end++;
                sum += end;
            }
            
            else{
                start++;
                sum -= start;
            }
        }
        
        return cnt;
    }
}