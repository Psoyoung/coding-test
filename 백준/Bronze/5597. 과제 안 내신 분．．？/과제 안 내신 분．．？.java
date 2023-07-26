import java.util.Scanner;

public class Main {
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int[] std = new int[30];
      int[] sub = new int[28];
      
      for(int i = 0; i < std.length; i++){
         std[i] = i+1;        
      }
      
      for(int i = 0; i < 28; i++){
         int a = sc.nextInt();
         
         sub[i] = a;
      }
      
      for(int a: std){
         int count = 0;
         
         for(int b: sub){
            if(a == b) count++;
         }
         
         if(count == 0) System.out.println(a);
      }
   }
}