import java.util.*;

class Solution {
    public String solution(String code) {
        Scanner sc = new Scanner(System.in);

        String ret = "";
        int mode = 0;

        char[] codeList = code.toCharArray();
        for(int i = 0; i < codeList.length; i++){

            if(codeList[i]=='1'){
                mode = mode == 0 ? 1 : 0;
            }
            else{
                if((mode == 0 && i % 2 == 0)||(mode == 1 && i % 2 == 1)){
                   ret += codeList[i];
                }
            }
        }
        
        return ret == ""? "EMPTY": ret;
    }
}