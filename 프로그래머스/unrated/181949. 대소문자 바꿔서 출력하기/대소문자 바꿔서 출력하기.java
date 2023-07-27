import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] change = a.toCharArray();

        for(int i = 0; i < change.length; i++){
           char c = change[i];
           if(Character.isUpperCase(c)){
               change[i] = Character.toLowerCase(c);
           }
           else{
               change[i] = Character.toUpperCase(c);
           }
        }

        System.out.println(change);
    }
}