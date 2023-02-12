import java.util.Scanner;
import java.net.FileNameMap;
import java.util.*;
import javax.swing.*;

public class ComputeRadius {
    public static void main(String[] args) {
        double radius, area = 0;
        final double PI = 3.1419;// Constant keyword that cant change
        JOptionPane.showMessageDialog(null, "Type the radius in the TERMINAL");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
        area = radius * radius * PI;
        System.out.print(area);
    }
}
