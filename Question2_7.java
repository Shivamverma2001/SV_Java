import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.JOptionPane;

public class Question2_7 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter a lower case letter");
        int ch = s.charAt(0);
        int diff = 'a' - 'A';
        char upperCase = (char) (ch - diff);
        JOptionPane.showMessageDialog(null, "The capital letter of " + s + " is " + upperCase);
    }
}
