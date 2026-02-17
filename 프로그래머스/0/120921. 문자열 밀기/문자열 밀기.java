class Solution {
    public int solution(String A, String B) {
        int len = A.length();
        int n = A.length();
        int cnt = 0;
        
        StringBuilder sb = new StringBuilder(A);
        
        while(len-- > 0){
            if(sb.toString().equals(B)) return cnt;
            
            char last = sb.charAt(n-1);
            
            sb.deleteCharAt(n-1);
            sb.insert(0,last);
            
            cnt++;
        }
        
        return -1;
    }
}