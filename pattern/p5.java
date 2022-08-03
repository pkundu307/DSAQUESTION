package pattern;

public class p5 {
    public static void main(String[] args) {
        int n = 4;
        int i = 0, k = 1;

        while (i <= n) {
            int j = 1;
            k = i;
            while (j <= i) {
                System.out.print(k + " ");
                k++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
