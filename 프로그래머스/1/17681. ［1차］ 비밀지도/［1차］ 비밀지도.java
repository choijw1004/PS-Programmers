class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] ans = new String[n];
        
        for(int i = 0 ; i < arr1.length; i++){
            String a = Integer.toString(arr1[i],2);
            String b = Integer.toString(arr2[i],2);
            
            StringBuilder sa = new StringBuilder();
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0 ; j < n - a.length(); j++){
                sa.append("0");
            }
            sa.append(a);
            
            for(int j = 0; j < n - b.length(); j++){
                sb.append("0");
            }
            sb.append(b);
            StringBuilder tmp = new StringBuilder();
            
            for(int j = 0 ; j < n; j++){
                if(sa.charAt(j) == '1' || sb.charAt(j) == '1') tmp.append("#");
                else tmp.append(" ");
            }
            ans[i] = tmp.toString();
        }
        return ans;
    }
}