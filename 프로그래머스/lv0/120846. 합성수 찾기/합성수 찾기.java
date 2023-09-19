class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i <= n; i++) {
            if (isComposite(i)) {
                answer++;
            }
        }
        
        return answer;
    }

    public static boolean isComposite(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}