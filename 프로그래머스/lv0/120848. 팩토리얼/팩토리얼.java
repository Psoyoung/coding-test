class Solution {
    public int solution(int n) {
        int answer = 1;
        int i = 1;
        while(n > answer){
            answer *= i;
            if(n < answer) break;
            i++;
        }
        return n == 1 ? 1 : i-1;
    }
}