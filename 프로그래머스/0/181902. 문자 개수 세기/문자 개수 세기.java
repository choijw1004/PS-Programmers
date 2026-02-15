class Solution {
    public int[] solution(String my_string) {
        int[] ans = new int[52];
        
        for(var c : my_string.toCharArray()){
            if(c >= 'A' && c <= 'Z') ans[c - 'A']++;
            
            else ans[c - 'a' + 26]++;
        }
        
        return ans;
    }
}