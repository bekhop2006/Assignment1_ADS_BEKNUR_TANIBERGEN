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

    /*
     * This method checks if a number is prime.
     * Time complexity: O(sqrt(n)), where n is the number being checked.
     * The algorithm checks for factors from 2 to sqrt(n). If any factor is found, the number is not prime.
     *
     * @param n The number to check
     * @return true if the number is prime, false otherwise
     */


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