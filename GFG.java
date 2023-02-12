class GFG {
    static int f(int a[], int i, int n) {
        if (n <= 0)
            return 0;
        else if (a[i] % 2 == 0)
            return a[i] + f(a, i + 1, n - 1);
        else
            return a[i] - f(a, i + 1, n - 1);
    }

    public static void main(String args[]) {
        int a[] = { 12, 7, 13, 4, 11, 6 };
        System.out.print(f(a, 0, 6));
    }
}