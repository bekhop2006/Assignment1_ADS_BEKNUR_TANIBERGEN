import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int n = scan.nextInt();

            if (n < 0) {
                System.out.println("Факториал для отрицательных чисел не существует.");
            } else {
                System.out.println("Факториал числа " + n + " = " + Factorial(n));
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000.0;
        System.out.printf("Время выполнения: %.4f миллисекунд\n", duration);
    }
    /*
     * This method calculates the factorial of a given number using recursion.
     * Time complexity: O(n), where n is the number for which the factorial is being calculated.
     * The algorithm recursively calls itself to multiply the number by the factorial of n-1.
     * The base case is when n is 0 or 1, returning 1.
     *
     * @param n The number to calculate the factorial for
     * @return The factorial of n
     */

    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }
}
