
import java.util.Scanner;

public class DigitChecker {
    public static boolean isAllDigits(String s){

        if (s.length() == 0){
            return false;
        }

        if (s.length() == 1){
            return Character.isDigit(s.charAt(0));
        }
        return Character.isDigit(s.charAt(0)) && isAllDigits(s.substring(1));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean isAllDigits = isAllDigits(s);

        if (isAllDigits){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
        scanner.close();
    }
}