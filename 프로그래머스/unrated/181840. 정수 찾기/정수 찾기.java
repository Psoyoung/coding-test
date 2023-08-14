import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list, int n) {
        boolean answer = IntStream.of(num_list).anyMatch(x -> x == n);
        return answer? 1 : 0;
    }
}