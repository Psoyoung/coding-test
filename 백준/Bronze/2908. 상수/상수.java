import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        StringBuffer sb1 = new StringBuffer(str1);
        String num1 = sb1.reverse().toString();

        StringBuffer sb2 = new StringBuffer(str2);
        String num2 = sb2.reverse().toString();

        int answer = Math.max(Integer.parseInt(num1), Integer.parseInt(num2));

        System.out.println(answer);
    }
}