import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String num = sc.next();

        int answer = 0;
        for(char c : num.toCharArray()) {
            answer += Character.getNumericValue(c);
        }

        System.out.println(answer);

    }
}