import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++){
            String str = i+"";
            int count = 0;
            
            for(char c: str.toCharArray()){
                if(c == 48 || c == 53){
                    count++;
                }
            }
            
            if(str.length() == count) list.add(i);
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        int[] empty = {-1};
        return answer.length == 0 ? empty : answer;
    }
}