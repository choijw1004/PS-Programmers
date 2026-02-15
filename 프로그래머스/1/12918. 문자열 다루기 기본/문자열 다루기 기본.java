class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;
        
        for(var c : s.toCharArray()){
            if(!Character.isDigit(c)) return false;
        }
        
        return true;
    }
}