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

    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }
}
