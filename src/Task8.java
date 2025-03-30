import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        System.out.println(isDigits(s,s.length()-1));
        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }
    /*
     * This method checks if a given string consists of only digits.
     * Time complexity: O(n), where n is the length of the string.
     * The algorithm checks each character of the string recursively to see if it is a digit.
     *
     * @param text The string to check
     * @param Curindex The current index being checked in the string
     * @return true if all characters in the string are digits, false otherwise
     */

    public static boolean isDigits(String text,int Curindex){
        if (Curindex==-1){
            return true;
        }
        switch (text.charAt(Curindex)){
            case '1','2','3','4','5','6','7','8','9','0': return isDigits(text, Curindex-1);
            default: return false;
        }
    }
}