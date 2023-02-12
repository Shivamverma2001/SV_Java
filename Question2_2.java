import javax.swing.JOptionPane;

public class Question2_2 {
    public static void main(String[] args) {
        final double PI = 3.14;
        String s1 = JOptionPane.showInputDialog(null, "Enter your radius", "This is for area and volume",
                JOptionPane.QUESTION_MESSAGE);
        String s2 = JOptionPane.showInputDialog(null, "Enter your length", "This is for area and volume",
                JOptionPane.QUESTION_MESSAGE);
        int radius = Integer.parseInt(s1);
        int length = Integer.parseInt(s2);
        double area = radius * radius * PI;
        double volume = area * length;
        JOptionPane.showMessageDialog(null, "area is " + area);
        JOptionPane.showMessageDialog(null, "volume is " + volume);
    }
}
