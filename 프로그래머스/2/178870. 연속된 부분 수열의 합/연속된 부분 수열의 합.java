class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] ans = new int[2];
        int start = 0;
        int end = 0;
        int sum = 0;
        int n = sequence.length;
        int len = Integer.MAX_VALUE;
        int minS = Integer.MAX_VALUE;
        
        //sequence
        while(end < n){
            sum += sequence[end];
            end++;
            
            while(sum > k){
                sum -= sequence[start];
                start++;
            }
            
            if(sum == k){
                int curLen = end - start;
                if(curLen < len || (curLen == len && start < minS)){
                    ans[0] = start;
                    ans[1] = end - 1;
                    len = curLen;
                    minS = start;
                }
            }
        }
        
        return ans;
    } 
}