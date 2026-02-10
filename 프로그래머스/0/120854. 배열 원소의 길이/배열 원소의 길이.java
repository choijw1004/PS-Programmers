class Solution {
    public int[] solution(String[] strlist) {
        int[] ans = new int[strlist.length];
        
        int i = 0;
        
        for(var s : strlist){
            ans[i] = s.length();
            i++;
        }
        return ans;
    }
}