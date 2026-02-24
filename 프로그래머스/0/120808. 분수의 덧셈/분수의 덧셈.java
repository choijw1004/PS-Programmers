class Solution {
    private int getGCD(int a, int b){
        if(b == 0) return a;
        
        return getGCD(b, a % b);
    }
    
    private int getLCM(int a, int b){
        int gcd = getGCD(a,b);
        
        return (a * b) / gcd;
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = getLCM(denom1, denom2);
        numer1 = numer1 * lcm / denom1;
        numer2 = numer2 * lcm / denom2;
        
        int top = numer1 + numer2;
        int bot = lcm;
        
        int gcd = getGCD(top, bot);
        
        top /= gcd;
        bot /= gcd;
        
        return new int[]{top,bot};
    }
}