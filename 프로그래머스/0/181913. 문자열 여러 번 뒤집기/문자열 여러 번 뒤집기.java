class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int[] q : queries){
            int start = q[0];
            int end = q[1];
            
            String sub = sb.substring(start, end + 1);
            String r = new StringBuilder(sub).reverse().toString();
            
            sb.replace(start, end + 1, r);
        }
        
        return sb.toString();
        
    }
}