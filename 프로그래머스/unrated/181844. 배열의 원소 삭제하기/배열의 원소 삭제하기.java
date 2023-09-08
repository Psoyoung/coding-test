import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : arr){
            int count = 0;
            for(int d : delete_list){
                if(a == d) count++;
            }
            if(count==0) list.add(a);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}