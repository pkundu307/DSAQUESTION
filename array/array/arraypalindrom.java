package array;

class arrayplaindrom {
    public static void main(String[] args) {
        int[] a = { 1, 4, 5, 9, 2 };
        int count = 0;
        int i = 0;
        int j = a.length - 1;
        for (i = 0; i < a.length; i++) {
            if (a[i] == a[j]) {
                i++;
                j--;
            } else if (a[i] > a[j]) {
                count++;
            } else {
                count++;
            }

        }
        System.out.println(count);

    }
}