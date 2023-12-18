import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < S; i++) {
            int num = sc.nextInt();
            String str = sc.next();

            for(char c : str.toCharArray()) {
                for(int j = 0; j < num; j++) {
                    sb.append(c);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}