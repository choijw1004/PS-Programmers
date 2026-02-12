class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        String s = Integer.toString(age);
        
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            sb.append((char) (c - '0' + 'a'));
        }
        return sb.toString();
    } 
}