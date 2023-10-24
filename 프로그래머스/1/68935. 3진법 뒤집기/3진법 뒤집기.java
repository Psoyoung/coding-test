class Solution {
    public int solution(int n) {  
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        sb.reverse();

        int answer = Integer.parseInt(sb.toString(),3);
        return answer;
    }
}