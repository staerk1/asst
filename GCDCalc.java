import java.util.Scanner;

public class GCDCalc{
    public static int calculateGCD(int a, int b){
        if (b == 0){
            return a;
        }
        return calculateGCD(b, a % b);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd = calculateGCD(a, b);
        System.out.println(gcd);
        scanner.close();
    }
}