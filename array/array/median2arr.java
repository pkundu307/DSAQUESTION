package array;

import java.util.Arrays;

public class median2arr {
    public static void main(String[] args) {
        int ar1[] = { 900 };
        int ar2[] = { 5, 8, 10, 20, 22 };

        int n1 = ar1.length;
        int n2 = ar2.length;
        int[] ar3 = new int[n1 + n2];
        System.arraycopy(ar1, 0, ar3, 0, n1);
        System.arraycopy(ar2, 0, ar3, n1, n2);
        Arrays.sort(ar3);
        median(ar3);
        System.out.print(median(ar3));

    }

    private static int median(int[] ar3) {
        int n = ar3.length;
        if (n % 2 == 0) {
            int a = ar3[n / 2];
            int b = ar3[(n / 2) - 1];
            return a + b;
        } else {
            int a = Math.round(n / 2);
            return ar3[a];
        }

    }

}