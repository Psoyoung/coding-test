class Solution {
    public int solution(String myString, String pat) {
        String answer = myString.replace("A","a")
                                .replace("B","b")
                                .replace("a","B")
                                .replace("b","A");
        return answer.contains(pat) ? 1 : 0;
    }
}