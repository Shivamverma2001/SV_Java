import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        int[][] a;
        a = new int[2][3];
        a[0][1] = 23;
        a[1][2] = 34;
        System.out.println(a[0][1] + " " + a[1][2]);
        System.out.println("row" + a.length);
        System.out.println("column" + a[0].length);
    }
}