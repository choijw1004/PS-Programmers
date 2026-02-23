class Solution {
    String[] sounds = {"aya", "ye", "woo", "ma"};
    
    private boolean can(String word, String prev){
        if(word.isEmpty()) return true;
        
        for(var c : sounds){
            if(!prev.equals(c) && word.startsWith(c)) {
                if(can(word.substring(c.length()), c)) return true; 
            }
        }
        
        return false;
    }
    public int solution(String[] babbling) {
        int cnt = 0;
        for(var ba : babbling){
            if(can(ba, "")) cnt++;
        }
        
        return cnt;
    }
}