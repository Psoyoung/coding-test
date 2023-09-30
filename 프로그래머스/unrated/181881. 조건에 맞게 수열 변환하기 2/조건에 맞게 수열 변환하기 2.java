import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean diff = true;
        
        while(diff){
            int[] arr2 = Arrays.copyOf(arr,arr.length);
            
            for(int i = 0; i < arr2.length; i++){
                if(arr2[i] >= 50 && arr2[i] % 2 == 0){
                    arr2[i] /= 2;
                }
                else if(arr2[i] < 50 && arr2[i] % 2 == 1){
                    arr2[i] = arr2[i] * 2 + 1;
                }
            }
            
            if(Arrays.equals(arr, arr2)){
                diff = false;
            }
            else{
                arr = arr2;
                answer++;
            }
        }
        return answer;
    }
}