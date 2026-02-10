class Solution {
    public int[] solution(int[] numbers) {
        for(int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            
            numbers[i] = num *2;
        }
        
        return numbers;
    }
}