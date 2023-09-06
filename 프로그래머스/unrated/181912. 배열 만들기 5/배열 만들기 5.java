import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                .filter(i->Integer.parseInt(i.substring(s,s+l)) > k)
                .mapToInt(i->Integer.parseInt(i.substring(s,s+l))).toArray();
    }
}