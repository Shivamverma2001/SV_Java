import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter an input", "Input Dialog Demp",
                JOptionPane.QUESTION_MESSAGE);
        String output = "Your number you enter is " + input;
        JOptionPane.showMessageDialog(null, output);

    }
}