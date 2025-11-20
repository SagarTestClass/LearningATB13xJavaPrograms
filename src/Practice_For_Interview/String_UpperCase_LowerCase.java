package Practice_For_Interview;

import java.util.Scanner;

public class String_UpperCase_LowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: "); // Example: aBACbcEDed
        String input = scanner.nextLine();

        System.out.println("Original String is: " + input);
        separateCharacters(input);
    }

    public static void separateCharacters(String input) {
        StringBuilder lowercase = new StringBuilder();
        StringBuilder uppercase = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercase.append(ch);
            } else if (Character.isUpperCase(ch)) {
                uppercase.append(ch);
            }
        }

        System.out.println("Output in Lowercase: " + lowercase);
        System.out.println("Output in Uppercase: " + uppercase);
    }
}
