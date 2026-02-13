class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int s1 = 0;
        int s2 = 0;
        
        for(var c : s.toUpperCase().toCharArray()){
            if(c == 'P') s1++;
            else if(c == 'Y') s2++;
        }
        
        return s1 == s2 ? true : false;
    }
}