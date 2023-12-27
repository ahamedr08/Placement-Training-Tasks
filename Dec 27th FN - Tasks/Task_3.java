import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClubbedWords {

    public static List<String> findAllClubbedWords(List<String> words) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (isClubbedWord(word, words)) {
                result.add(word);
            }
        }

        return result;
    }

    private static boolean isClubbedWord(String word, List<String> words) {
        for (String otherWord : words) {
            if (word.length() > otherWord.length() && word.contains(otherWord)) {
                String remaining = word.replace(otherWord, "");
                if (isClubbedWord(remaining, words)) {
                    return true;
                }
            }
        }
        return word.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        List<String> words = new ArrayList<>();

        System.out.println("Enter the words:");

        for (int i = 0; i < n; i++) {
            words.add(scanner.nextLine());
        }

        List<String> clubbedWords = findAllClubbedWords(words);

        System.out.println("Clubbed Words:");
        System.out.println(clubbedWords);
    }
}
