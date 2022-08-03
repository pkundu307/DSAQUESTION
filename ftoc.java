import java.util.Scanner;

public class ftoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), e = sc.nextInt(), w = sc.nextInt();
        for (int i = s; i <= e; i += w) {
            int Celsius = ((i - 32) * 5) / 9;
            System.out.println(i + " " + Celsius);

        }
    }

}
