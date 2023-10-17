import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        
        for(int i = left; i <= right; i++){
            int num = i;
            long cnt = IntStream.rangeClosed(1, num)
                            .filter(index -> num % index == 0)
                            .count();
            int sum = cnt % 2 == 0 ?  + num : - num;
            answer += sum;
        }
        
        return answer;
    }
}