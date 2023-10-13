import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        String collect = Arrays.stream(Long.toString(n).split(""))
                            .sorted(Comparator.reverseOrder())
                            .collect(Collectors.joining());

        return Long.parseLong(collect);
    }
}