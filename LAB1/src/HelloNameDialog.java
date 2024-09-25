// Example 3: HelloNameDialog.java
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        String result_LeQuangKhai = JOptionPane.showInputDialog("Le Quang Khai - 20225638 - Please enter your name");
        JOptionPane.showMessageDialog(null, "Toi ten la Le Quang Khai "+ "Hi " + result_LeQuangKhai + "!");
        System.exit(0);
    }
}
