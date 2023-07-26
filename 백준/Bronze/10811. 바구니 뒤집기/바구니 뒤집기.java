import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] basket = new int[m];

        for(int i = 0; i < m; i++){
            basket[i] = i+1;
        }

        for(int i = 0; i < n; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            for(int j = a; j < b; j++){
                int tmp = basket[j];
                basket[j] = basket[b];
                basket[b] = tmp;
                b--;
            }
        }

        for(int num : basket){
            System.out.print(num + " ");
        }
    }
}