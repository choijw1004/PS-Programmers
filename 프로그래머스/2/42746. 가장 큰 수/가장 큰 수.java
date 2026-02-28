import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strs = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        if (sb.charAt(0) == '0') return "0";
        return sb.toString();
    } 
}