package pattern;

public class p1 {
    public static void main(String[] args) {
        int n = 4;
        int i = 0;
        while (i < n) {
            int j = 1;
            while (j <= n) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
