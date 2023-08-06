class Solution {
    public int solution(int num1, int num2) {
        double div = (Double.valueOf(num1)/Double.valueOf(num2)) * 1000;
        return (int)div;
    }
}