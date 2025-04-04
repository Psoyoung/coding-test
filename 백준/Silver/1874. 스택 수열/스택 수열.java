import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //3

        int[] inputNumArr = new int[n];
        for (int i = 0; i < n; i++) {
            inputNumArr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>(); 

        int i = 1;
        for (int inputNum : inputNumArr) { //[3,2,1]

            while (i <= inputNum) { //(1 <= 3)
                stack.push(i++); // [1,2,3]
                sb.append("+\n");
            }

            if (stack.peek() == inputNum) { //stack top이 입력 값과 일치하면 pop (3 == 3)
                stack.pop(); //3을 뺌 [1,2]
                sb.append("-\n");
            } else { //만약 [3,1,2]면 안됨됨
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }

        System.out.println(sb.toString());
    }
}