import javax.swing.JOptionPane;

public class Question2_11 {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Enter employee's name ");
        String s2 = JOptionPane.showInputDialog(null, "Enter number of hour worked in a week");
        String s3 = JOptionPane.showInputDialog(null, "Enter hourly pay rate");
        String s4 = JOptionPane.showInputDialog(null, "Enter federal tax withholding rate");
        String s5 = JOptionPane.showInputDialog(null, "Enter state tax withholding rate");
        int time = Integer.parseInt(s2);
        int pay = Integer.parseInt(s3);
        int tpay = pay * time;
        double f = Double.parseDouble(s4);
        double federal = f * 0.2;
        double s = Double.parseDouble(s5);
        double state = s * 0.09;
        double total = federal + state;
        double net = tpay - total;
        JOptionPane.showMessageDialog(null, "Employee Name " + s1);
        JOptionPane.showMessageDialog(null, "Hours worked " + s2);
        JOptionPane.showMessageDialog(null, "Pay rate: $" + s3);
        JOptionPane.showMessageDialog(null, "Gross rate: $" + tpay);
        JOptionPane.showMessageDialog(null, "Deduction: ");
        JOptionPane.showMessageDialog(null, "Federal withholdng (20.0%)" + federal);
        JOptionPane.showMessageDialog(null, "State withholdng (9.0%)" + state);
        JOptionPane.showMessageDialog(null, "Total Deduction: " + total);
        JOptionPane.showMessageDialog(null, "Net pay: " + net);
        
    }
}
