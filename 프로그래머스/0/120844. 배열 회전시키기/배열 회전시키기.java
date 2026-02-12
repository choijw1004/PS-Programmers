class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] ans = new int[numbers.length];
        
        for(int i = 0 ; i < numbers.length; i++){
            if(direction.equals("left")){
                int idx = (i + 1) % numbers.length;
                ans[i] = numbers[idx];
            }
            else{
                int idx = (numbers.length - 1 + i) % numbers.length;
                ans[i] = numbers[idx];
            }
        }
        return ans;
    }
}