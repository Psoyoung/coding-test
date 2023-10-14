import java.util.stream.LongStream;

class Solution {
    public long solution(int a, int b) {
        long start = Math.min(a,b);
        long end = Math.max(a,b);

        return LongStream.rangeClosed(start, end).sum();
    }
}