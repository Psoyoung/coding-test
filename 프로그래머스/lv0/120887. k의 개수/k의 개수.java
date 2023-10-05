class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int x = i; x <= j; x++){
            String a = Integer.toString(x);
            String b = Integer.toString(k);
            
            if(a.contains(b)){
                int num = a.length() - a.replace(b, "").length();
                answer+=num;
            }
        }
        return answer;
    }
}