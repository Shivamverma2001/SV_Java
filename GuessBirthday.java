import javax.swing.JOptionPane;

public class GuessBirthday {
    public static void main(String[] args) {
        String s1 = " 1 3 5 7\n" + " 9 11 13 15\n" + " 17 19 21 23\n" + " 25 27 29 31\n";
        String s2 = " 2 3 6 7\n" + " 10 11 14 15\n" + " 18 19 22 23\n" + " 28 29 30 31\n";
        String s3 = " 4 5 6 7\n" + " 12 13 14 15\n" + " 20 21 22 23\n" + " 28 29 30 31\n";
        String s4 = " 8 9 10 11\n" + " 12 13 14 15\n" + " 24 25 26 27\n" + " 28 29 30 31\n";
        String s5 = " 16 17 18 19\n" + " 20 21 22 23\n" + " 24 25 26 27\n" + " 28 29 30 31\n";
        int date = 0;
        int ans = JOptionPane.showConfirmDialog(null, "Is your birthday in these numbers?\n" + s1);
        if (ans == JOptionPane.YES_OPTION)
            date += 1;
        ans = JOptionPane.showConfirmDialog(null, "Is your birthday in these numbers?\n" + s2);
        if (ans == JOptionPane.YES_OPTION)
            date += 2;
        ans = JOptionPane.showConfirmDialog(null, "Is your birthday in these numbers?\n" + s3);
        if (ans == JOptionPane.YES_OPTION)
            date += 4;
        ans = JOptionPane.showConfirmDialog(null, "Is your birthday in these numbers?\n" + s4);
        if (ans == JOptionPane.YES_OPTION)
            date += 8;
        ans = JOptionPane.showConfirmDialog(null, "Is your birthday in these numbers?\n" + s5);
        if (ans == JOptionPane.YES_OPTION)
            date += 16;
        JOptionPane.showMessageDialog(null, "Your birthday is " + date + "!");
    }
}