class Solution {
    private boolean isPrime(int n){
        if(n < 2) return false;
        
        for(int i = 2; i * i <=n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public int solution(int n) {
        int cnt = 0;
        
        for(int i = 2; i <= n; i++){
            if(isPrime(i))cnt++;
        }
        return cnt;
    }
}