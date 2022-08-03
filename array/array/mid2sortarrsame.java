package array;

import java.util.Arrays;

public class mid2sortarrsame {
    public static void main(String[] args) {
        int ar1[] = { 900, 1000, 1100 };
        int ar2[] = { 5, 8, 10, 11 };

        int n1 = ar1.length;
        int n2 = ar2.length;
        int[] ar3 = new int[n1 + n2];
        System.arraycopy(ar1, 0, ar3, 0, n1);
        System.arraycopy(ar2, 0, ar3, n1, n2);
        System.out.print(Arrays.toString(ar3));
        Arrays.sort(ar3);
        System.out.print(Arrays.toString(ar3));
        System.out.print(median(ar3));
    }

    private static int median(int[] ar3) {
        int n = ar3.length;
        if (n % 2 == 0) {
            int a = n / 2;
            int b = (n / 2) - 1;
            int ans = (ar3[a] + ar3[b]) / 2;
            return ans;
        } else {
            return (ar3[Math.round(n / 2)]);
        }

    }
}