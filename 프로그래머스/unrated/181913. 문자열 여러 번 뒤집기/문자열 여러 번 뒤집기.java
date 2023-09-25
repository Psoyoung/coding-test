class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for(int i = 0; i < queries.length; i++){

            int s = queries[i][0];
            int e = queries[i][1]+1;
            
            String str = my_string.substring(s, e);
            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();
            
            my_string = my_string.substring(0, s) + reverse 
                      + my_string.substring(e,my_string.length());
            
        }
        return my_string;
    }
}