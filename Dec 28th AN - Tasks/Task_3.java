import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        rearrangeArray(arr);

        System.out.println("After rearranging the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rearrangeArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            
            // Move i to the right until a positive number is found
            while (i < j && arr[i] < 0) {
                i++;
            }

            // Move j to the left until a negative number is found
            while (i < j && arr[j] >= 0) {
                j--;
            }

            // Swap arr[i] and arr[j] if i is still less than j
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
