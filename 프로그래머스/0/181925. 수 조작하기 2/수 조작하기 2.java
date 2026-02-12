class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < numLog.length-1; i ++){
            int end = numLog[i+1];
            int start = numLog[i];
            
            if(end - start == 1) sb.append("w");
            else if(end - start == 10) sb.append("d");
            else if(end - start == -1) sb.append("s");
            else sb.append("a");
        } 
        
        return sb.toString();
    }
}