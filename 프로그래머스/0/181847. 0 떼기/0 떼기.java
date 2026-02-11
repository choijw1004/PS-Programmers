class Solution {
    public String solution(String n_str) {
        char[] arr = n_str.toCharArray();
        
        int idx = 0;
        
        while(idx < n_str.length()){
            if(arr[idx] - '0' == 0){
                idx++;
            }
            else break;
        }
        
        return idx == 0 ? n_str : n_str.substring(idx);
    }
}