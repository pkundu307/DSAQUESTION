package pattern;

public class p8 {
    public static void main(String[] args) {

        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("" + (char) (65 + i));
            }
            System.out.println("");
        }
    }

}