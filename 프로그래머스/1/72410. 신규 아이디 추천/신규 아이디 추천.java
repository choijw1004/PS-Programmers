class Solution {
    public String solution(String new_id) {
        String s = new_id.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c) || Character.isDigit(c) 
                || c == '-' || c == '.' || c == '_'){
                sb.append(c);
            }
        }
        s = sb.toString();
        
        sb.setLength(0);
        char prev = ' ';
        for(char c : s.toCharArray()){
            if(c == '.' && prev == '.') continue;
            sb.append(c);
            prev = c;
        }
        s = sb.toString();
        
        if(!s.isEmpty() && s.charAt(0) == '.') s = s.substring(1);
        if(!s.isEmpty() && s.charAt(s.length()-1) == '.') s = s.substring(0, s.length()-1);
        
        if(s.isEmpty()) s = "a";
        
        if(s.length() > 15) s = s.substring(0, 15);
        if(s.charAt(s.length()-1) == '.') s = s.substring(0, s.length()-1);
        
        while(s.length() < 3) s += s.charAt(s.length()-1);
        
        return s;
    }
}