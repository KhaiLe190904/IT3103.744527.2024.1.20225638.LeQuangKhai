import java.util.Arrays;
import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Le Quang Khai - 20225638\nEnter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Le Quang Khai - 20225638\nEnter element of array: ");
        int sum = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println("Array after soft is: " + Arrays.toString(arr));
        System.out.println("Sum of array is: " + sum);
        System.out.println("Average of array is: " + (double) sum / arr.length);
    }
}
