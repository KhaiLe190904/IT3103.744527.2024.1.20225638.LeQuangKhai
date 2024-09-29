import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Le Quang Khai - 20225638 Do you want to change to first class ticket ?");
        JOptionPane.showMessageDialog(null, "Le Quang Khai 20225638 \n You 've chosen: "
                + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}
