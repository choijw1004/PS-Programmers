import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(var c : arr){
            if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
    }
}