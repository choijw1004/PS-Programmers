class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        
        for(var v : index_list){
            sb.append(my_string.charAt(v));
        }
        return sb.toString();
    }
}