import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] words = input.split(" ");

        // Reverse the array of strings
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(" ");  // Add space between words except after the last word
            }
        }
    }
}
