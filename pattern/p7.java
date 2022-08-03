package pattern;

public class p7 {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        int k = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {

                System.out.print(k);

                j++;
                k = j;
            }
            System.out.println();
            i++;
        }
    }
}
