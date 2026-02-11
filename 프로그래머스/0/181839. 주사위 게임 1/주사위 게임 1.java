class Solution {
    public int solution(int a, int b) {
        if((a + b) % 2 == 0 && a % 2 == 0) return Math.abs(a - b);
        else if((a + b) % 2 == 1) return 2 *(a+b);
        else return (int)Math.pow(a,2) + (int)Math.pow(b,2); 
    }
}