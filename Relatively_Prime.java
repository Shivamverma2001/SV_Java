import java.io.*;
import java.util.*;

public class Relatively_Prime {
    public static void main(String[] args) {
        long l = 0, r = 0;
        Scanner sc = new Scanner(System.in);
        l = sc.nextLong();
        r = sc.nextLong();
        System.out.println("Yes");
        for (long i = l; i < r - l + 1; i += 2) {
            System.out.println(i + " " + (i + 1));
        }
    }
}