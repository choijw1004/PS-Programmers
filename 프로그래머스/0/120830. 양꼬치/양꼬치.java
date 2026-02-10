class Solution {
    public int solution(int n, int k) {
        int res = n / 10;
        
        k -= res;
        
        return (n * 12000) + (k * 2000);
    }
}