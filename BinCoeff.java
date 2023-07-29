
import java.util.Scanner;

public class BinCoeff{
    public static int calculateBinomialCoefficient(int n, int k){
        if (k == 0 || k == n){
            return 1;
        }

        return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = calculateBinomialCoefficient(n, k);
        System.out.println(result);
        scanner.close();
    }
}