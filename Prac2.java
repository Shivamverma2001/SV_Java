import java.io.*;
import java.util.*;

public class Prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k > 3) {
                k -= 3;
                n -= k;
            }
            if (n % 2 == 1)
                System.out.print(1 + " " + n / 2 + " " + n / 2);
            else {
                n /= 2;
                if (n % 2 == 0)
                    System.out.print(n + " " + n / 2 + " " + n / 2);
                else {
                    System.out.print((n - 1) + " " + (n - 1)+" "+2);
                }
            }
            while (k-- > 0)
                System.out.print(" " + 1);
            System.out.println();
        }
    }
}
