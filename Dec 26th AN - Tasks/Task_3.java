import java.util.Scanner;

public class DynamicZShapePrint {

     public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        printZShape(input);
    }

    public static void printZShape(String input) {
        char[] charArray = input.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == length - 1 || i + j == length - 1) {
                    System.out.print(charArray[j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}