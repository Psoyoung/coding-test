class Solution {
    public int solution(String t, String p) {
        int t_len = t.length();
        int p_len = p.length();

        int answer = 0;

        for(int i = 0; i <= t_len-p_len; i++) {
            long num = Long.parseLong(t.substring(i, i+p_len));
            if(Long.parseLong(p) >= num) {
                answer++;
            }
        }
        
        return answer;
    }
}