import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int num = 0;

        while (sb.length() < p + (t - 1) * m){
            sb.append(Integer.toString(num, n).toUpperCase());
            num++;
        }

        StringBuilder ans = new StringBuilder();
        for(int i = p - 1; ans.length() < t; i += m){
            ans.append(sb.charAt(i));
        }

        return ans.toString();
    }
}