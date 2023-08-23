import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {    
        strArr = Arrays.stream(strArr)
                 .filter(i -> !i.contains("ad"))
                 .toArray(String[]::new);
        return strArr;
    }
}