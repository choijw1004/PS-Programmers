class Solution {
    public int solution(int a, int b, int n) {
        int ans = 0;
        
        while(n >= a){
            int e = n / a;
            ans += e * b;
            
            n = n % a + e * b;
        }
        
        return ans;
    }
}