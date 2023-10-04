import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(String[] strArr) {
        int answer = IntStream.range(1, 31).map(i -> (int) Arrays.stream(strArr).filter(n -> n.length() == i).count()).max().orElse(0);
        return answer;
    }
}