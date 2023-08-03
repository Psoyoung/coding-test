class Solution {
    public int solution(String number) {
        
        char[] numList = number.toCharArray();
        
        int sum = 0;
        for(char c : numList){
            String num = String.valueOf(c);
            sum += Integer.parseInt(num);
        }
        
        return sum % 9;
    }
}