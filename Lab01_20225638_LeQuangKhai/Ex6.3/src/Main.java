import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Le Quang Khai - 20225638 \nEnter height of triangle: ");
        int height = sc.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
