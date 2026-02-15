class Solution {
    public int solution(int[] numbers, int k) {
        int count = 1;
        int currIdx = 0;
        
        while(count < k){
            currIdx = (currIdx + 2) % numbers.length;
            
            count++;
        }
        
        return numbers[currIdx];
    }
}