class Solution {
    public int solution(String my_string) {
        char[] arr = my_string.toCharArray();
        int sum = 0;
        
        for(var c : arr){
            if(Character.isDigit(c)) sum += c -'0';
        }
        return sum;
    }
}