import javax.swing.JOptionPane;

import java.lang.*;
import javax.swing.*;

public class Question2_6 {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Enter the digit between 0 to 1000 ", "Sum of all digits",
                JOptionPane.QUESTION_MESSAGE);
        int a = Integer.parseInt(s1);
        int sum = 0;
        while (a % 10 != 0) {
            sum += a % 10;
            a = a / 10;
        }
        JOptionPane.showMessageDialog(null, "Your sum of the number is " + sum);
    }
}
