import java.util.*;
    
class Solution {
    public int solution(int[] sides) {
    
        Arrays.sort(sides); 
        
        int a = sides[1] - (sides[1]-sides[0]); 
        int b = sides[0] - 1;
        int c = b < 0 ? 0 : b;
        
        return a + c;
    }
}