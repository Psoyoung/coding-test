class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        char c = 65;
        int index = 0;
        
        while(c<=122){
            if(c == 91) c = 97;
            
            String str = String.valueOf(c);
            answer[index] = my_string.length() - my_string.replace(str, "").length();
            
            c++;
            index++;
        }
        
        return answer;
    }
}