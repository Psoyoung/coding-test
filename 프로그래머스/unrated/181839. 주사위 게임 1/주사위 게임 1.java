class Solution {
    public int solution(int a, int b) {
        double answer = 0;
        if(a % 2 == 1 && b % 2 ==1) answer = Math.pow(a, 2.0) + Math.pow(b, 2.0);
        else if(a % 2 == 1 || b % 2 ==1) answer= 2 * (a + b);
        else answer = a - b;
        
        return Math.abs((int)answer);
    }
}