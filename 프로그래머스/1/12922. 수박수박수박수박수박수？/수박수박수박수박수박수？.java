class Solution {
    public String solution(int n) {
        String r = "수박";
        
        return n % 2 == 0 ? r.repeat(n / 2) : r.repeat(n / 2) + "수";
    }
}