import javax.swing.JOptionPane;

public class CaculateTwoNumbers {

    public static void main(String[] args) {
        String strNum1, strNum2; double num1, num2;

        strNum1 = JOptionPane.showInputDialog(null,
                "Le Quang Khai - 20225638 - Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null,
                "Le Quang Khai - 20225638 - Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);
        String stringResult =
                "Le Quang Khai - 20225638\n" +
                        "The sum of those two numbers is: " + (num1 + num2) + "\n" +
                        "The difference of those two numbers is: " + (num1 - num2) + "\n" +
                        "The product of those two numbers is: " + (num1 * num2) + "\n";
        if(num2 == 0){
            stringResult = stringResult + "Khong the chia cho 0\n";
        }else stringResult += "The quotient of those two numbers is: " + (num1 / num2) + "\n";
        JOptionPane.showMessageDialog(null, stringResult, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }

}
