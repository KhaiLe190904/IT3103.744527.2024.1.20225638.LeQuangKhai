import java.util.Scanner;

public class EquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Le Quang Khai - 20225638 - Choose the type of equation:");
        System.out.println("1. First-degree equation (ax + b = 0)");
        System.out.println("2. System of first-degree equations with two variables");
        System.out.println("3. Second-degree equation (ax^2 + bx + c = 0)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                solveLinearEquation(scanner);
                break;
            case 2:
                solveSystemOfEquations(scanner);
                break;
            case 3:
                solveQuadraticEquation(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static void solveLinearEquation(Scanner scanner) {
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Le Quang Khai - 20225638 - Phuong trinh vo nghiem.");
        } else {
            double x = -b / a;
            System.out.println("Nghiem: x = " + x);
        }
    }

    public static void solveSystemOfEquations(Scanner scanner) {
        System.out.println("Enter a11, a12, b1: ");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();

        System.out.println("Enter a21, a22, b2: ");
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Le Quang Khai - 20225638 - He phuong trinh vo so nghiem.");
            } else {
                System.out.println("Le Quang Khai - 20225638 - He phuong trinh vo nghiem.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Nghiem: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Day la phuong trinh bac nhat.");
            solveLinearEquation(scanner);
        }
        if (a != 0) {
            System.out.println("Enter b: ");
            double b = scanner.nextDouble();
            System.out.println("Enter c: ");
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Phuong trinh 2 nghiem phan biet: x1 = " + root1 + ", x2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Nghiem kep: x = " + root);
            } else {
                System.out.println("Le Quang Khai - 20225638 - Vo nghiem.");
            }
        }
    }
}
