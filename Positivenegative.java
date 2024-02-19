import javax.swing.JOptionPane;

public class Positivenegative{
    public static void main(String[] args) {
        //variables
        int userNumber;
        //inputs
        userNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number."));
        //output
        if (userNumber>0) {
            JOptionPane.showMessageDialog(null, "Your number is positive.");
        } else {
            JOptionPane.showMessageDialog(null, "Your number is negative.");
        }
    }
}
