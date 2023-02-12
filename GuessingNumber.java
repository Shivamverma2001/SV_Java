import java.util.*;
import javax.swing.*;

public class GuessingNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        JOptionPane.showMessageDialog(null, "Guess a magic number between 0 and 100");
        int guess = -1;
        guess = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
        while (guess != number) {

            if (guess == number)
                JOptionPane.showMessageDialog(null, "Yes the number is " + number);
            else if (guess < number)
                guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Your guess is too low"));
            else
                guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Your guess is too high"));
        }
    }
}