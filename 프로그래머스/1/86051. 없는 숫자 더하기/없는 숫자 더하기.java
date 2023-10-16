import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        
        int sum = IntStream.rangeClosed(0, 9).sum();
        IntStream intStream = Arrays.stream(numbers);
        
        return sum - intStream.sum();
    }
}