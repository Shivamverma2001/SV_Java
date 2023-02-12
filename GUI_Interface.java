import java.util.*;
import javax.swing.*;

public class GUI_Interface {
    public static void main(String[] args) {
        int sum = 0;
        int option = 0;
        do {
            sum += Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your number"));
            option = JOptionPane.showConfirmDialog(null, "Do you want to continue");
        } while (option != JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "The sum of your number is " + sum);
    }
}