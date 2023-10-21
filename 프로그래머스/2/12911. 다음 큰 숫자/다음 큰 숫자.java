class Solution {
    public int solution(int n) {
        int cnt = Integer.bitCount(n);

        while(true){
            int bitCnt = Integer.bitCount(++n);

            if(cnt == bitCnt){
                break;
            }
        }
        
        return n;
    }
}