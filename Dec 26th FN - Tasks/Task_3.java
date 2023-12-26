import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        boolean isHappy = isHappyNumber(n);
        System.out.println("Is " + n + " a happy number? " + isHappy);
    }

    public static boolean isHappyNumber(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNextHappyNumber(n);
        }

        return n == 1;
    }

    public static int getNextHappyNumber(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
