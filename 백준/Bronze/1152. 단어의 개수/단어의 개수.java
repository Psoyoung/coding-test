import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.trim();
        String[] arr = str.split(" ");

        int answer = str.equals("") ? 0 : arr.length;
        System.out.println(answer);
    }
}