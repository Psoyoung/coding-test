import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 0){
           IntStream.range(0,arr.length).filter(i-> i % 2 !=0).forEach(i-> arr[i] = arr[i]+n);
        }else{
           IntStream.range(0,arr.length).filter(i-> i % 2 ==0).forEach(i-> arr[i] = arr[i]+n);
        }
        return arr;
    }
}