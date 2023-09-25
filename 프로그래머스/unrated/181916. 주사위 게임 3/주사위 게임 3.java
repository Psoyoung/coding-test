import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        
        int minVal = arr[0], maxVal = arr[3];
        int minCnt = 0, maxCnt = 0;
        
        for(int num : arr){
            if(num == maxVal){
                maxCnt++;
            }
            else if(num == minVal){
                minCnt++;
            }
        }       
        
        if(maxCnt == 4){
            answer = maxVal * 1111;
        }
        else if(maxCnt == 3){
            answer = (int)Math.pow(10 * maxVal + minVal, 2);
        }
        else if(minCnt == 3){
            answer = (int)Math.pow(10 * minVal + maxVal, 2);
        }
        else if(maxCnt == 2 && minCnt == 2){
            answer = (maxVal + minVal) * (maxVal-minVal);
        }
        else if(maxCnt == 2){
            answer = arr[0] * arr[1];
        }
        else if(minCnt == 2){
            answer = arr[2] * arr[3];
        }
        else if(arr[1] == arr[2]){
            answer = minVal * maxVal;
        }
        else{
            answer = arr[0];
        }
        
        return answer;
    }
}