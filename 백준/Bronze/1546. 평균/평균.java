import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] scoreList = new double[n];
        double max = 0, sum = 0;

        for(int i = 0; i < n; i++){
            scoreList[i] = sc.nextDouble();
        }

        for(double score : scoreList){
            if(max < score) max = score;
        }

        for(double score : scoreList){
            sum += score/ max * 100;
        }

        System.out.println(sum/n);
    }
}