import java.util.Scanner;

public class Task9 {
    private static int[][] memo;

    public static void main(String[] args) {
        double startTime = System.nanoTime();

        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            memo = new int[n + 1][k + 1];
            System.out.println(BinomialCef(n, k));
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000.0;
        System.out.printf("Время выполнения: %.4f миллисекунд\n", duration);
    }
    /*
     * This method calculates the binomial coefficient C(n, k) using recursion with memoization.
     * Time complexity: O(n * k), where n and k are the parameters for the binomial coefficient.
     * Memoization avoids recomputing the same values repeatedly, improving efficiency.
     *
     * @param n The total number of elements (bottom of the binomial coefficient)
     * @param k The number of elements to choose (top of the binomial coefficient)
     * @return The binomial coefficient C(n, k)
     */

    public static int BinomialCef(int n, int k) {
        if (k == 0 || k == n) return 1;
        if (memo[n][k] != 0) return memo[n][k];
        memo[n][k] = BinomialCef(n - 1, k - 1) + BinomialCef(n - 1, k);
        return memo[n][k];
    }
}
