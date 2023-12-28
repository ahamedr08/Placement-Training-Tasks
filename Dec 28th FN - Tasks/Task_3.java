import java.util.Scanner;

public class PalPrime {

    public PalPrime(int number, String message) {
        System.out.println("Number " + number + " is " + message);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            boolean isPrime = isPrime(number);
            boolean isPalindrome = isPalindrome(number);

            if (isPrime && isPalindrome) {
                new PalPrime(number, "PalPrime");
            } else if (isPrime) {
                new PalPrime(number, "Prime");
            } else if (isPalindrome) {
                new PalPrime(number, "Palindrome");
            } else {
                new PalPrime(number, "Neither Prime nor Palindrome");
            }
        }

        scanner.close();
    }
}
