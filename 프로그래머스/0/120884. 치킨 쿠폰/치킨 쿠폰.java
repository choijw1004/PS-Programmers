class Solution {
    private int recur(int coupon){
        if(coupon < 10) return 0;
        
        int newCoupon = (coupon / 10) + (coupon % 10);
        
        return coupon / 10 + recur(newCoupon);
    }
    
    public int solution(int chicken) {
        return recur(chicken);
    }
}