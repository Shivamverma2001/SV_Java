import java.util.*;

import javax.swing.*;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = gcdans(a, b);
        System.out.println(ans);
    }

    public static int gcdans(int a, int b) {
        int g = 1;
        int k = 2;
        while (k <= a && k <= b) {
            if (a % k == 0 && b % k == 0)
                g = k;
            k++;
        }
        return g;
    }
}