public class q3 {
    public static void main(String[] args) {
        int n = 123, reverse = 0;
        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
