import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        Map<Integer,Double> map = new HashMap<>();
        int[] answer = new int[numlist.length];

        for (int num : numlist){
            double val = num-n < 0 ? Math.abs(num-n) : num-n-0.1;
            map.put(num, val);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());

        // Value 기준으로 내림차순 정렬
        Collections.sort(keySet, (v1, v2) -> (map.get(v1).compareTo(map.get(v2))));
        int i = 0;
        for (Integer key : keySet) {
            answer[i] = key;
            i++;
        }
        
        return answer;
    }
}