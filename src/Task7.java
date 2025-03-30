import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();

        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            ShowR(scan, n);
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000.0;
        System.out.printf("Время выполнения: %.4f миллисекунд\n", duration);
    }
    /*
     * This method prints a sequence of numbers in reverse order using recursion.
     * Time complexity: O(n), where n is the number of elements in the sequence.
     * The algorithm reads the input recursively and prints the values in reverse order
     * after the recursive call returns, effectively reversing the order of the sequence.
     *
     * @param scan The scanner used to read the input
     * @param n The number of elements in the sequence
     * @return None (the method prints the reversed sequence to the output)
     */

    public static void ShowR(Scanner scan, int n) {
        if (n == 0) return;
        int curNum = scan.nextInt();
        ShowR(scan, n - 1);
        System.out.print(curNum + " ");
    }
}
