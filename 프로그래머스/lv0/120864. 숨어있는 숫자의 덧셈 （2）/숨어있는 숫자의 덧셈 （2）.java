class Solution {
    public int solution(String my_string) {
        String[] numList = my_string.split("[a-zA-Z]+");
        int answer = 0;
        
        for(String num : numList){
            if(!num.equals("")) answer += Integer.parseInt(num);
        }        
        return answer;
    }
}