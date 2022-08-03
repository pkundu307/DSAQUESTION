import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int i = 1,
                sop = 0,
                pos = 1;
        int arr[] = new int[n];
        while (i <= n) {
            sop += i;
            i++;
        }
        for (i = 1; i <= n; i++) {
            pos = pos * i;
        }
        if (f == 1) {
            System.out.println(sop);
        } else if (f == 2) {
            System.out.println(pos);
        } else {
            System.out.println("-1");
        }

    }
}