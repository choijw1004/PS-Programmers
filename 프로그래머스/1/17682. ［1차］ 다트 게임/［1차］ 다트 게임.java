import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int n = dartResult.length();
        int[] scores = new int[3]; // 3번의 다트 점수
        int round = -1;
        
        for (int i = 0; i < n; i++) {
            char c = dartResult.charAt(i);
            
            if (Character.isDigit(c)) {
                round++;
                if (c == '1' && i + 1 < n && dartResult.charAt(i + 1) == '0') {
                    scores[round] = 10;
                    i++; 
                } else {
                    scores[round] = c - '0';
                }
            } else if (c == 'S') {
            } else if (c == 'D') {
                scores[round] = (int) Math.pow(scores[round], 2);
            } else if (c == 'T') {
                scores[round] = (int) Math.pow(scores[round], 3);
            } else if (c == '*') {
                scores[round] *= 2;
                if (round > 0) scores[round - 1] *= 2;
            } else if (c == '#') {
                scores[round] *= -1;
            }
        }
        
        return scores[0] + scores[1] + scores[2];
    }
}