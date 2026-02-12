class Solution {
    private int getGCD(int a, int b){
        if(b == 0) return a;
        else return getGCD(b, a % b);
    }
    public int solution(int n) {
        int gcd = getGCD(n,6);
        
        int a = (n / gcd) * 6;
        
        return a / 6;
    }
}