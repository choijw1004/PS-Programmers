class Solution {
    public String solution(String cipher, int code) {
        char[] arr = cipher.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = code-1; i < arr.length; i+= code) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}