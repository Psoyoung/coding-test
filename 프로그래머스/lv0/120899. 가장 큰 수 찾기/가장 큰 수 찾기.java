import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int index = Arrays.binarySearch(array, max);

        return new int[]{max, index};
    }
}