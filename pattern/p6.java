package pattern;

public class p6 {
    public static void main(String[] args) {
        int n = 4, i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
