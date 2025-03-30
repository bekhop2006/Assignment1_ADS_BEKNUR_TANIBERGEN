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
    /*
     * This method finds the minimum element in the array
     * using an iterative approach.
     * Time complexity: O(n), where n is the size of the array.
     * The algorithm iterates over all elements in the array to find the minimum.
     *
     * @param arr The array to search through
     * @return The smallest element in the array
     */

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
