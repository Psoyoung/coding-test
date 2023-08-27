import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> num = new ArrayList<>();

        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)) num.add(Character.getNumericValue(c));
        }
        return num.stream()
                .mapToInt(i -> i)
                .sorted()
                .toArray();
    }
}