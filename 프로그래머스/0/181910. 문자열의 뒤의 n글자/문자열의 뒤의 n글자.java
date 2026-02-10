class Solution {
    public String solution(String my_string, int n) {
        String sub = my_string.substring(my_string.length()-n,my_string.length());
        return sub;
    }
}