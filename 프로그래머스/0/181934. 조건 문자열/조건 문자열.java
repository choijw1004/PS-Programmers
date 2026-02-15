class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String e = ineq + eq;
        
        if(e.equals(">=") && n >= m) return 1;
        else if(e.equals("<=") && n <= m) return 1;
        else if(e.equals(">!") && n > m) return 1;
        else if(e.equals("<!") && n < m) return 1;
        
        return 0;
        
    }
}