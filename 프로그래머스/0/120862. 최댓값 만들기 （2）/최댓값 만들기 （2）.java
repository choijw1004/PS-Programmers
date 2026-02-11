import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int v1 = numbers[0] * numbers[1];
        int v2 = numbers[numbers.length -1] * numbers[numbers.length -2];
        
        return Math.max(v1, v2);
    }
}