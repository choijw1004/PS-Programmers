class Solution {
    private boolean isPrime(long n){
        if(n < 2) return false;
        
        for(long i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public int solution(int n, int k) {
        String bit = Integer.toString(n,k);
        String[] parts = bit.split("0");

        int cnt = 0;
        for(String part : parts){
            if(part.isEmpty()) continue;
            long num = Long.parseLong(part);  
            if(isPrime(num)) cnt++;
        }
        return cnt;
        
    }
}