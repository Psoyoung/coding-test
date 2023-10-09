import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int[] mon = Arrays.stream(nums).distinct().toArray();
        
        int len1 = nums.length/2;
        int len2 = mon.length;
        
        return len1 > len2 ? len2 : len1;
    }
}