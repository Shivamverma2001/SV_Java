public class VaribleArgument {
    public static void main(String[] args) {
        System.out.println(sum1(10, 20));
        System.out.println(sum1(10, 20, 40, 50));
    }

    static int sum1(int... b) {
        int sum = 0;
        for (int p : b) {
            sum += p;
        }
        return sum;
    }
}
