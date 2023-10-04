import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        double powerOf2 = Math.pow(2, Math.ceil(Math.log(arr.length) / Math.log(2)));
        return Arrays.copyOf(arr, (int) powerOf2);
    }
}