class Solution {
    public int solution(String my_string) {
        String[] sp = my_string.split(" ");
        
        int sum = Integer.parseInt(sp[0]);
        
        
        for(int i = 1; i < sp.length; i += 2){
            if(sp[i].equals("+")){
                sum += Integer.parseInt(sp[i+1]);
            }
            
            else{
                sum -= Integer.parseInt(sp[i+1]);
            }
        }
        
        return sum;
    }
}