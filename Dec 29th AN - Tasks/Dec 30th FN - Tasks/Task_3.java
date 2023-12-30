import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimePalindromeThreads {
    private static final Object lock = new Object();
    private static List<Integer> primeNumbers = new ArrayList<>();
    private static List<Integer> palindromeNumbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for the ranges from the user
        System.out.print("Enter the start of the prime number range: ");
        int primeStart = scanner.nextInt();

        System.out.print("Enter the end of the prime number range: ");
        int primeEnd = scanner.nextInt();

        System.out.print("Enter the start of the palindrome number range: ");
        int palindromeStart = scanner.nextInt();

        System.out.print("Enter the end of the palindrome number range: ");
        int palindromeEnd = scanner.nextInt();

        // Create two threads
        Thread primeThread = new Thread(() -> findPrimes(primeStart, primeEnd));
        Thread palindromeThread = new Thread(() -> findPalindromes(palindromeStart, palindromeEnd));

        // Start the threads
        primeThread.start();
        try {
            primeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        palindromeThread.start();
        try {
            palindromeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the results
        System.out.println("Prime numbers from " + primeStart + " to " + primeEnd + " : " + primeNumbers);
        System.out.print("\n");
        System.out.println("Palindrome numbers from " + palindromeStart + " to " + palindromeEnd + " : " + palindromeNumbers);

        // Close the scanner
        scanner.close();
    }

    private static void findPrimes(int start, int end) {
        synchronized (lock) {
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    primeNumbers.add(i);
                }
            }
        }
    }

    private static void findPalindromes(int start, int end) {
        synchronized (lock) {
            for (int i = start; i <= end; i++) {
                if (isPalindrome(i)) {
                    palindromeNumbers.add(i);
                }
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
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
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}
