import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(Avg(arr));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/1000000;
        System.out.println(duration);
    }


    public static double Avg(int[] arr){
        double sum = 0;
        for (int elem : arr){
            sum+=elem;
        }
        double res = sum/arr.length;
        return res;
    }
}