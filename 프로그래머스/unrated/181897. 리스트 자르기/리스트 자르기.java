import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        if(n == 1){
            return Arrays.copyOf(num_list, slicer[1]+1);
        }
        else if(n == 2){
            return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
        }
        else if(n ==3){
            return Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
        }       
        else{
            int[] array = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
            for(int i = 0; i < array.length; i++){
                if(i %  slicer[2] == 0) list.add(array[i]);
            }
            return list.stream().mapToInt(i -> i).toArray();
        }
    }
}