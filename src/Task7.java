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

    public static void ShowR(Scanner scan, int n) {
        if (n == 0) return;
        int curNum = scan.nextInt();
        ShowR(scan, n - 1);
        System.out.print(curNum + " ");
    }
}
