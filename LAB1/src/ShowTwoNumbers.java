// Example 5: ShowTwoNumbers.java
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1_LQK, strNum2_LQK;
        String strNotification_LQK = "You've just entered: ";

        strNum1_LQK = JOptionPane.showInputDialog(null,
                "Le Quang Khai 20225638 - Please input the first number: ",
                "Le Quang Khai 20225638 - Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification_LQK += strNum1_LQK + " and ";

        strNum2_LQK = JOptionPane.showInputDialog(null,
                "Le Quang Khai 20225638 - Please input the second number: ",
                "Le Quang Khai 20225638 - Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification_LQK += strNum2_LQK;
        JOptionPane.showMessageDialog(null, strNotification_LQK,
                "Show two numbers", JOptionPane.INFORMATION_MESSAGE) ;
        System.exit(0);
    }

}
