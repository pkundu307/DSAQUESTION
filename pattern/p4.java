package pattern;

public class p4 {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        while (i <= n) {
            int j = n;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
