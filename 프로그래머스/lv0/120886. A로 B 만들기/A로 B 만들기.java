import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] bfList = before.toCharArray();
        char[] afList = after.toCharArray();
        
        Arrays.sort(bfList);
        Arrays.sort(afList);
        
        before = String.valueOf(bfList);
        after = String.valueOf(afList);
        
        return before.equals(after) ? 1 : 0;
    }
}