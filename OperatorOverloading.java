import java.util.*;

public class OperatorOverloading {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b, double c) {
        double d;
        if (a > b)
            d = a;
        else
            d = b;
        return d > c ? d : c;
    }

    public static void main(String[] args) {
        int a, b, c;
        a = max(3, 4);
        System.out.println("The maximum between 3 and 4 is \n" + a);
        System.out.println("The maximum between 3 and 4 is \n" + max(3.0, 4.0));
        System.out.println("The maximum between 3 and 4 is \n" + max(3.0, 4.0, 5.0));
    }
}
