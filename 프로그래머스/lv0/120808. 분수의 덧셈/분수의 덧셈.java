class Solution {
    public int[] solution(int num1, int denum1, int num2, int denum2) {

    int n = denum1*denum2; 
    int de = denum1*num2+denum2*num1; 
    int max = 1;  

    for(int i=1; i <= n && i<= de; i++){
        if(n%i==0 && de%i==0){
            max = i;
        }
    }

    int[] answer = {de/max, n/max};    
    return answer;
    }
}