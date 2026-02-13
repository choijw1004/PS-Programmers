class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        
        char[] c = code.toCharArray();
        
        for(int i= 0 ; i < c.length; i++){
            if(i % q == r) sb.append(c[i]);
        }
        
        return sb.toString();
    }
}