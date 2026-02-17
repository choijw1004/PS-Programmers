class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(var c : s.toCharArray()){
            if(c == ' ') sb.append(" ");
            
            else if(c >= 'a' && c <= 'z'){
                sb.append((char)('a' + (c - 'a' + n) % 26));
            }
            else{
                sb.append((char)('A' + (c - 'A' + n) % 26));
            }
        }
        
        return sb.toString();
    }
}