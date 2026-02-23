import java.util.*;

class Solution {
       public int solution(String dirs) {
        Set<String> set = new HashSet<>();
        int[] curr = {0, 0};
        int cnt = 0;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        String dir = "UDLR";

        for (char c : dirs.toCharArray()) {
            int d = dir.indexOf(c);
            int nx = curr[0] + dx[d];
            int ny = curr[1] + dy[d];

            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) continue;

            String forward = curr[0] + "," + curr[1] + "," + nx + "," + ny;
            String backward = nx + "," + ny + "," + curr[0] + "," + curr[1];

            if (!set.contains(forward)) {
                cnt++;
                set.add(forward);
                set.add(backward);
            }

            curr[0] = nx;
            curr[1] = ny;
        }

        return cnt;
    }
}