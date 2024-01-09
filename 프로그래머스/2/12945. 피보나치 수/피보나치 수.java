class Solution {
    public int solution(int n) {
        if (n == 2) return 1; // n이 2일 경우 바로 1을 반환

        int a = 0; // F(0)
        int b = 1; // F(1)
        int c = 0; // 다음 피보나치 수를 저장할 변수

        for (int i = 2; i <= n; i++) {
            c = (a + b) % 1234567; // 다음 피보나치 수 계산 및 1234567로 나눈 나머지 저장
            a = b; // F(n-2)를 F(n-1)로 업데이트
            b = c; // F(n-1)을 F(n)으로 업데이트
        }
        return c;
    }
}