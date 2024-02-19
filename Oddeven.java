import javax.swing.JOptionPane;

public class Oddeven {
    public static void main(String[] args) {
    int userNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number."));

    if (userNumber % 2 == 0) {
        JOptionPane.showMessageDialog(null, "Your number is even.");
    } else {
        JOptionPane.showMessageDialog(null, "Your number is uneven.");
    }
}
}