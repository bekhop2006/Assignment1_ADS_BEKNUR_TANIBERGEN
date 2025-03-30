import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число для вычисления числа Фибоначчи: ");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("Ошибка: число не может быть отрицательным.");
        } else {
            System.out.println("Число Фибоначчи с индексом " + n + " равно: " + Fib(n));
        }

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000.0;
        System.out.printf("Время выполнения: %.4f миллисекунд\n", duration);
    }
    /*
     * This method calculates the nth Fibonacci number using recursion.
     * Time complexity: O(2^n), due to overlapping subproblems in recursion.
     * The algorithm recursively calculates Fibonacci numbers, making repeated calls.
     * It can be optimized with memoization.
     *
     * @param n The position of the Fibonacci number in the sequence
     * @return The nth Fibonacci number
     */

    public static int Fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return Fib(n - 1) + Fib(n - 2);
    }
}
