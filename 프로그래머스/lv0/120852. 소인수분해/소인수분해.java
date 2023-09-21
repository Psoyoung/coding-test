import java.util.*;

class Solution {
    public int[] solution(int n) {

        List<Integer> list = primeFactorization(n);

        return list.stream()
                .distinct()
                .mapToInt(i -> i)
                .toArray();
    }

    public static List<Integer> primeFactorization(int number) {
        List<Integer> factors = new ArrayList<>();
        int divisor = 2;

        while (number > 1) {
            if (number % divisor == 0) {
                factors.add(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }

        return factors;
    }
}