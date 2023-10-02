import java.util.*;
    
class Solution {
    public int solution(int[] sides) {
    
        Arrays.sort(sides); 
        
        int a = sides[1] - (sides[1]-sides[0]); 
        int b = sides[0] - 1;
        
        return a + b;
    }
}