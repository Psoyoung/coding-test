import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        PriorityQueue<Integer> lowest = new PriorityQueue<>();
        PriorityQueue<Integer> highest = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < A.length; i++){
            lowest.add(A[i]);
            highest.add(B[i]);
        }

        while(!lowest.isEmpty()){
            answer += lowest.poll() * highest.poll();
        }

        return answer;
    }
}