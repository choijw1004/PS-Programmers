class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split("[a-zA-Z]");
        
        int sum = 0;
        for(var v : arr){
            if(!v.isEmpty()){
                sum += Integer.parseInt(v);
            }
        }
        
        return sum;
    }
}