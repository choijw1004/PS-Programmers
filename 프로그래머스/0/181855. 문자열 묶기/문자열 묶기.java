class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[31];
        
        for(var s : strArr){
            arr[s.length()]++;
        }
        
        int max = -1;
        
        for(int i : arr){
            max = Math.max(i,max);
        }
        return max;
    }
}