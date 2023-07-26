import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] rest = new int[10];
        int count = 0;

        for(int i = 0; i < rest.length; i++){
            rest[i] = sc.nextInt() % 42;

            for(int j = 0; j < i; j++){
                if(rest[i] == rest[j]){
                    count ++;
                    break;
                }
            }
        }

        System.out.println(rest.length - count);
    }
}