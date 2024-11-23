import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Le Quang Khai 20225638 - What 's your name ?");
        String strName = sc.nextLine();
        System.out.println("Le Quang Khai 20225638 - How old are you ?");
        int iAge = sc.nextInt();
        System.out.println("Le Quang Khai 20225638 - How tall are you (m) ?");
        double dHeight = sc.nextDouble();

        System.out.println("Mrs/Ms. "+strName+", "+iAge+" years old. "+"Your height is "+dHeight+".");
    }
}
