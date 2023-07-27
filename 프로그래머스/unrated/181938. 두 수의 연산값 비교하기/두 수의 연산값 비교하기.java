class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(a +""+ b);
        int multi = 2 * a * b;

        int answer = Math.max(ab, multi);
        
        return answer;
    }
}