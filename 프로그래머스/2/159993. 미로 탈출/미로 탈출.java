import java.util.*;

class Solution {
    int n, m;
    char[][] map;
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    private int bfs(int sx, int sy, int ex, int ey) {
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] v = new boolean[n][m];

        q.add(new int[]{sx, sy});
        v[sx][sy] = true;

        int time = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();

                if (curr[0] == ex && curr[1] == ey)
                    return time;

                for (int d = 0; d < 4; d++) {
                    int nx = curr[0] + dx[d];
                    int ny = curr[1] + dy[d];

                    if (nx >= 0 && ny >= 0 && nx < n && ny < m
                            && !v[nx][ny]
                            && map[nx][ny] != 'X') {

                        v[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
            time++;
        }

        return -1;
    }

    public int solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();
        map = new char[n][m];

        int[] S = null;
        int[] L = null;
        int[] E = null;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = maps[i].charAt(j);

                if (c == 'S') S = new int[]{i, j};
                if (c == 'L') L = new int[]{i, j};
                if (c == 'E') E = new int[]{i, j};

                map[i][j] = c;
            }
        }

        int sl = bfs(S[0], S[1], L[0], L[1]);
        if (sl == -1) return -1;

        int le = bfs(L[0], L[1], E[0], E[1]);
        if (le == -1) return -1;

        return sl + le;
    }
}