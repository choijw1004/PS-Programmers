class Solution {
    public String solution(String s) {
        int[] ans = new int[26];
        
        for(var c : s.toCharArray()){
            ans[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < ans.length; i++){
            if(ans[i] == 1) sb.append((char)('a' + i)); 
        }
        
        return sb.toString();
    }
}