class Solution {
    public String solution(String code) {
        int m = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < code.length(); i++){
            char c = code.charAt(i);
            
            if(m == 0){
                if(c != '1'){
                    if(i % 2 == 0) sb.append(c);
                }
                else{
                    m = 1;
                }
            }
            else{
                if(c != '1'){
                    if(i % 2 == 1) sb.append(c);
                }
                else{
                    m = 0;
                }
            }
        }
        return sb.length() == 0 
            ? "EMPTY"
            : sb.toString();
    }
}