import java.util.*;

class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        
        
        sb.append(Integer.toString(a)).append(Integer.toString(b));
        
        int val1= Integer.parseInt(sb.toString());
        
        int val2 = a * 2 * b;
        
        return val1 == val2 ? val1 : Math.max(val1,val2);
    }
}