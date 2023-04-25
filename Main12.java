import java.io.*;
import java.util.*;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ss = new StringBuilder();
        ss = ss.append(s);
        ss.reverse();
        int sum = 0;
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) != s.charAt(i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}