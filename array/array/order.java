package array;

import java.util.Arrays;

public class order {

    public static void main(String[] args) {
        int arr[] = { 1, 4, 4, 1, 1, 7, 7, 4, 7, 4, 7, 4, 7, 4 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            } else {
                System.out.println(-1);
                break;
            }
        }
        // System.out.println(Arrays.toString(arr));

    }
}
