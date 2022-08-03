package array;

public class linearseach {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 5, 3 };
        int x = 5;
        int result = search(arr, x);
        System.out.println(result);
    }

    public static int search(int arr[], int a) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (arr[i] == a)
                return i;
        }
        return -1;
    }

}