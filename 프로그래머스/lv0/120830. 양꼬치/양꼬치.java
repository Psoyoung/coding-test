class Solution {
    public int solution(int n, int k) {
        k-= n/10;
        int answer = (n * 12000) + (k * 2000);
        
        return answer;
    }
}