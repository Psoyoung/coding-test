import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d);
        
        int answer = 0;
        for(int n : d){
            budget = budget - n;
            if(budget < 0){
                break;
            }
            else if(budget == 0){
                answer++;
                break;
            }
            else{
                answer++;
            }
        }
        
        return answer;
    }
}