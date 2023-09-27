class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if(eq.equals("!")){
            answer = compare(n, m, ineq);
        }
        else{
            answer = compare(n ,m, ineq);
        }

        System.out.println(answer);
        
        return answer;
    }
    
    public static int compare(int n, int m, String ineq){
        int result = 0;
        switch(ineq){
            case "<":
                result = n <= m ? 1:0;
                break;
            case ">":
                result = n >= m ? 1:0;
                break;
        }
        return result;
    }
}