class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        
        for(int i = 1; i <= count; i++){
            sum += price * i;
        }

        
        long amt = sum - (long)money;
        return  amt > 0 ? amt : 0;
    }
}