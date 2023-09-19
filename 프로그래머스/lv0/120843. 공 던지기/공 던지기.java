class Solution {
    public int solution(int[] numbers, int k) {
        int i = (k-1) * 2;
        int length = numbers.length;
        
        while(i > length){
            i -= length;
        }
        return numbers[i];
    }
}