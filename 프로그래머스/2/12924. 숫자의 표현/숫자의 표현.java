class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1;
        int end = 1;
        int sum = 0;
        
        while (start <= n) {
            if (sum == n) {
                answer++;
                sum -= start;
                start++;
            } else if (sum < n) {
                sum += end;
                end++;
            } else {
                sum -= start;
                start++;
            }
        }
    
        return answer;
    }
}