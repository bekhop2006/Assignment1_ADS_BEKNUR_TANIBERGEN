import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (is_Prime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }



    public static boolean is_Prime(int n){
        if(n<2) return false;
        for (int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}