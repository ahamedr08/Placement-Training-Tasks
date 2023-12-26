import java.util.Scanner;

public class SeparateOddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] inputArray = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int[] evenArray = new int[size];
        int[] oddArray = new int[size];

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < size; i++) {
            if (inputArray[i] % 2 == 0) {
                evenArray[evenCount++] = inputArray[i];
            } else {
                oddArray[oddCount++] = inputArray[i];
            }
        }

        System.out.print("Even Array: [");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i]);
            if (i < evenCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Odd Array: [");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i]);
            if (i < oddCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}
