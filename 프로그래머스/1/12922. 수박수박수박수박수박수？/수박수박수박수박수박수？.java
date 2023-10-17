class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            if(i % 2 == 0) sb.insert(i, "수");
            else sb.insert(i, "박");
        }
        return sb.toString();
    }
}