class Solution {
    public int solution(int[] sides) {
        int sum = sides[0] + sides[1];
        int max = Math.max(sides[0], sides[1]);
        int other = sum - max;
        int cnt = 0;
        cnt += (sum - 1) - (max - other + 1) + 1;
        return cnt;
    }
}