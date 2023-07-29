import java.util.Scanner;

public class FactorialCalc{
    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println(result);
        scanner.close();
    }
}