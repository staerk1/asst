import java.util.Scanner;

public class PowerCalc{
    public static int power(int a, int n){
        if (n == 0){
            return 1;
        }

        return a * power(a, n - 1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int result = power(a, n);
        System.out.println(result);
        scanner.close();
    }
}