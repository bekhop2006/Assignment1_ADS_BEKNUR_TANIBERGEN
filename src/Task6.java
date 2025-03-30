import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int n = scan.nextInt();

        System.out.println(My_pow(a,n));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }
    /*
     * This method calculates the power of a number (a^n) using recursion.
     * Time complexity: O(n), where n is the exponent.
     * The algorithm recursively multiplies the base by itself n times.
     * The base case is when n is 0, returning 1. If n is negative, it calculates the reciprocal.
     *
     * @param a The base number
     * @param n The exponent
     * @return The result of a raised to the power n
     */

    public static double My_pow(int a,int n){
        if(n==0){
            return 1;
        } else if (n<0) {
            return 1/My_pow(a,-n);
        }
        return a*My_pow(a,n-1);
    }
}