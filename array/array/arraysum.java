package array;

public class arraysum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 5, 3 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}