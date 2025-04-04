import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int inputNum = sc.nextInt();
           
            if(inputNum == 0){
                stack.pop();
            
            } else{
                stack.push(inputNum);
            } 
        }


        int sum = 0;
        for (int num : stack) {
            sum += num;
        }

        System.out.println(sum);
    }
}