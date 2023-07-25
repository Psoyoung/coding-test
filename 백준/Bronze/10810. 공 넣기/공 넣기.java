import java.util.Arrays;
import java.util.Scanner;

public class Main {
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int[] basket = new int[a];
      Arrays.fill(basket, 0);
      
      for(int i=0; i < b; i++){
         int n = sc.nextInt();
         int m = sc.nextInt();
         int ball = sc.nextInt();
         
         for(int j=n-1; j <= m-1; j++){
            basket[j] = ball;
         }
      }
      
      for(int num : basket){
         System.out.print(num + " ");         
      }
   }
}