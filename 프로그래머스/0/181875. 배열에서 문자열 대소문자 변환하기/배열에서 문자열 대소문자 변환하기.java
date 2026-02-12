class Solution {
    public String[] solution(String[] strArr) {
        for(int i = 0 ; i < strArr.length; i++){
            if(i % 2 == 0){
                String newString = strArr[i].toLowerCase();
                strArr[i] = newString;
            }
            else{
                String newString = strArr[i].toUpperCase();
                strArr[i] = newString;
            }
        }
        return strArr;
    }
}