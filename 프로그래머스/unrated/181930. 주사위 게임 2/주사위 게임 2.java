class Solution {
    public int solution(int a, int b, int c) {
        double sum = 0;

        if(a != b && b != c && a != c) {
           sum = a + b + c;
        }
        else if(a == b && b == c){
           sum = (a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2))
                   * (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        }
        else{
           sum = (a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        }

        int answer = (int)sum;
        return answer;
    }
}