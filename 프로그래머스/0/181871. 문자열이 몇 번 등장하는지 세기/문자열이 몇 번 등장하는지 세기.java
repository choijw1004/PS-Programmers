class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        
        for(int i = 0 ; i + pat.length() -1 < myString.length(); i++){
            if(myString.substring(i, i + pat.length()).equals(pat)) cnt++; 
        }
        return cnt;
    }
}