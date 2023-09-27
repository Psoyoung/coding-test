class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        return compare(n, m, ineq);
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