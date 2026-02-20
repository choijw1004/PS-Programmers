class Solution {
    private int getGCD(int a, int b){
        if(b == 0) return a;
        
        return getGCD(b, a % b);
    }
    
    private int getLCM(int a, int b){
        int gcd = getGCD(a, b);
        
        return (a * b) / gcd;
    }
    public int solution(int[] arr) {
        int startLCM = getLCM(arr[0],arr[1]);
        int ans = 0;
        
        for(int i = 2; i < arr.length; i++){
            int newLCM = getLCM(startLCM, arr[i]);
            
            startLCM = newLCM;
        }
        
        return startLCM;
    }
}