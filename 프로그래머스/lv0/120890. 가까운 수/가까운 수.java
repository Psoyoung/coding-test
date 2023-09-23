class Solution {
    public int solution(int[] array, int n) {
        int gap = Math.abs(n - array[0]);
        int answer = array[0];
        
        for(int num : array){
            int abs = Math.abs(n - num);
            if(gap > abs || (gap >= abs && answer > num)){
                answer = num;
                gap = abs;
            }
        }
        return answer;
    }
}