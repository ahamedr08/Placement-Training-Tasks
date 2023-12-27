import java.util.Scanner;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        int[] result = new int[n];

        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            leftProducts[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            rightProducts[i] = rightProduct;
            rightProduct *= nums[i];
        }

        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] input = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        int[] output = productExceptSelf(input);

        System.out.print("Output: [");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            if (i < output.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}

