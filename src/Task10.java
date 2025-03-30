import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();

        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(GCD(a, b));
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000.0;
        System.out.printf("Время выполнения: %.4f миллисекунд\n", duration);
    }
    /*
     * This method calculates the Greatest Common Divisor (GCD) of two numbers
     * using the recursive Euclidean Algorithm.
     * Time complexity: O(log(min(a, b))), where a and b are the numbers being evaluated.
     * The algorithm recursively reduces the problem using the formula GCD(a, b) = GCD(b, a % b).
     *
     * @param a The first number
     * @param b The second number
     * @return The greatest common divisor of a and b
     */

    public static int GCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) return a;
        return GCD(b, a % b);
    }
}
