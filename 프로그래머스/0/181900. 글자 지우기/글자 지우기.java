class Solution {
    public String solution(String my_string, int[] indices) {
        int[] cnt = new int[my_string.length()];
        
        for(int i = 0 ; i < indices.length; i++){
            cnt[indices[i]]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < cnt.length; i++){
            if(cnt[i] != 1) sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}