class Solution {
    public int solution(String s) {
        int isX = 1;
        int notX = 0;
        int cnt = 0;
        char c = s.charAt(0);
        
        for (int i = 1; i < s.length(); i++) {
            if (isX == 0) { c = s.charAt(i); }

            if (s.charAt(i) == c) isX++;
            else notX++;

            if (isX > 0 && isX == notX) {
                cnt++;
                isX = 0;
                notX = 0;
            }
        }
        if (isX + notX > 0) cnt++;
        
        return cnt;
    }
}