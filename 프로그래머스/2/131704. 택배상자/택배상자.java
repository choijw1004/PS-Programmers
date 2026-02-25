import java.util.*;
class Solution {
    public int solution(int[] order) {
        int cnt = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int target = 0; 
        for (int item = 1; item <= order.length; item++) {
            if (item == order[target]) {
                cnt++;
                target++;
            } else {
                stack.push(item);
            }

            while (!stack.isEmpty() && stack.peek() == order[target]) {
                stack.pop();
                cnt++;
                target++;
            }
        }

        return cnt;
    }
}