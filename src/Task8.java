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