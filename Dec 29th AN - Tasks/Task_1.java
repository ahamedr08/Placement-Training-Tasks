import java.util.Scanner;

public class Calculator {

    // Method to multiply two integers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method overload to multiply three doubles
    public double multiply(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int int2 = scanner.nextInt();

        // Call the multiply method with two integers
        int resultInt = calculator.multiply(int1, int2);
        System.out.println("Multiplication of two integers: " + resultInt);
        
        System.out.print("\n");
        System.out.print("Enter the first double: ");
        double double1 = scanner.nextDouble();
        System.out.print("Enter the second double: ");
        double double2 = scanner.nextDouble();
        System.out.print("Enter the third double: ");
        double double3 = scanner.nextDouble();

        // Call the multiply method overload with three doubles
        double resultDouble = calculator.multiply(double1, double2, double3);
        System.out.println("Multiplication of three doubles: " + resultDouble);

        scanner.close();
    }
}
