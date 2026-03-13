class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long sum = 0;
        
        int[] arr = new int[queue1.length * 2];
        
        for(int i = 0 ; i < arr.length / 2; i++){
            arr[i] = queue1[i];
            arr[i + arr.length / 2] = queue2[i];
            sum += queue1[i];
            sum += queue2[i];
        }
        
        if(sum % 2 != 0) return -1;
        long target = sum / 2;
        
        int n = arr.length;
        int start = 0;
        int end = arr.length / 2;
        
        long windowSum = 0;
        for(int i = 0; i < end; i++) windowSum += arr[i];
        
        int answer = 0;
        
        while(end < n){
            if(windowSum == target){
                return answer;
            } else if(windowSum < target){
                windowSum += arr[end++]; 
            } else {
                windowSum -= arr[start++]; 
            }
            answer++;
        }
        
        return -1;
    }
}