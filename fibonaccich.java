import java.util.Scanner;
import java.lang.Math;

public class fibonaccich {
    static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s * s == x);
    }

    static boolean isFibonacci(int n) {
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5 * n * n + 4) ||
                isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isFibonacci(n) ? "true" : n + "false");
    }
}
