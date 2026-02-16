class Solution {
    public int solution(String t, String p) {
        
        int start = 0;
        int end = 0;
        StringBuilder sb = new StringBuilder();
        long target = Long.parseLong(p);
        int cnt = 0;
        
        while(end < t.length()){
            
           if(end - start + 1 < p.length()){
               sb.append(t.charAt(end));
               end++;
           }
            else{
                sb.append(t.charAt(end));
                
                long a = Long.parseLong(sb.toString());
                
                if(a <= target) cnt++;
                
                sb.deleteCharAt(0);
                start++;
                end++;
            }
        }
        
        return cnt;
    }
}