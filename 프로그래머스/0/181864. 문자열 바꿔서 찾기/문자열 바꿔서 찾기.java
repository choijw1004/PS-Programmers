class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        for(var c : myString.toCharArray()){
            sb.append(c == 'A' ? 'B' : 'A');
        }
        
        return sb.toString().contains(pat) ? 1 : 0;
    }
}