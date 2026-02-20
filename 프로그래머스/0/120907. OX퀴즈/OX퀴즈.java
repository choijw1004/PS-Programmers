class Solution {
    public String[] solution(String[] quiz) {
        String[] ans = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[2]);
            int z = Integer.parseInt(s[4]);
            
            int result = s[1].equals("+") ? x + y : x - y;
            ans[i] = result == z ? "O" : "X";
        }
        
        return ans;
    }
}