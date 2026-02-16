class Solution {
    public int[] solution(String s) {
        
        int cnt = 0;
        int erase = 0;
        
        String newString = s;
        
        while(true){
            StringBuilder sb = new StringBuilder();
            
            for(char c : newString.toCharArray()){
                if(c == '0') erase++;
                if(c == '1') sb.append(c);
            }
            
            if(sb.length() == 1) {
                cnt++;
                break;
            }
            newString = Integer.toString(sb.length(),2);
            
            cnt++;
        }
        return new int[]{cnt, erase};
    }
}