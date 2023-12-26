import java.util.Scanner;

public class DisplayInteger {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int enteredInteger = scanner.nextInt();

        System.out.println("Entered Integer: " + enteredInteger);
    }
}
