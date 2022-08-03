class fstlst {

    static void p(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        p(n - 1);

    }

    public static void main(String[] args) {

        p(5);
    }
}