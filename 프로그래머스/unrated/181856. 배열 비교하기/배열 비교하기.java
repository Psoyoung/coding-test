import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length > arr2.length){
            answer = 1;
        }else if(arr1.length < arr2.length){
            answer = -1;
        }else if(arr1.length == arr2.length){
            int a = Arrays.stream(arr1).sum();
            int b = Arrays.stream(arr2).sum();
            
            if(a > b){
                answer = 1;
            }else if(b > a){
                answer = -1;
            }else{
                answer = 0;
            }
        }
        
        return answer;
    }
}