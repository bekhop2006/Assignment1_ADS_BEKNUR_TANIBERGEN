import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                if (scan.hasNextInt()) {
                    arr[i] = scan.nextInt();
                } else {
                    System.out.println("Введено не число, попробуйте снова.");
                    return;
                }
            }

            System.out.println("Минимальный элемент: " + Minimum(arr));
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        double duration = (endTime - startTime) / 1000.0;
        System.out.printf("Время выполнения: %.4f секунд\n", duration);
    }

    public static int Minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
