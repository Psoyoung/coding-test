class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        answer[0] = x;
            
        for(int i = 1;i < n; i++){
            num += x;
            answer[i] = num;
        }
        
        return answer;
    }
}