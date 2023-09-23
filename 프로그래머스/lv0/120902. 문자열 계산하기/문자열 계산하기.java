class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);

        for(int i  = 1; i < arr.length; i+=2){
            int num = Integer.parseInt(arr[i+1]);
            switch(arr[i]){
                case "+":
                    answer += num;
                    break;
                case "-":
                    answer -= num;
                    break;
            }
        }
        
        return answer;
    }
}