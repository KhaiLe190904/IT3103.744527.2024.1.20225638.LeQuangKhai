import java.util.Scanner;
public class exe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Le Quang Khai 20225638 - Enter size of matrix: ");
        int size = sc.nextInt();
        int[][] firstMatrix = new int[size][size];
        int[][] secondMatrix = new int[size][size];
        int[][] resultMatrix = new int[size][size];

        System.out.println("Le Quang Khai 20225638 - Enter the element of first matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Le Quang Khai 20225638 - Enter the element of second matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                secondMatrix[i][j] = sc.nextInt();
                resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("Le Quang Khai 20225638 - The sum of two matrix is:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) System.out.print(resultMatrix[i][j] + " ");
            System.out.println();
        }
    }
}
