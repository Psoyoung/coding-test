class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[num_list.length+1];

        for(int i = 0; i <= num_list.length; i++){
            
            if(num_list.length == i){
                int num1 = num_list[i-1];
                int num2 = num_list[i-2];
                answer[i] = num1 > num2 ? num1-num2 : num1*2;
            }
            else{
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}