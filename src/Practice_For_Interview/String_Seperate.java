package Practice_For_Interview;

import java.util.Scanner;

public class String_Seperate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: "); // Example: Subbu123raj
        String input = scanner.nextLine();

        System.out.println("Original String is: " + input);
        separateAlphaAndNumeric(input);
    }

    public static void separateAlphaAndNumeric(String input) {
        StringBuilder alphapart = new StringBuilder();
        StringBuilder numericpart = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphapart.append(ch);
            } else if (Character.isDigit(ch)) {
                numericpart.append(ch);
            }
        }

        System.out.println("Output in Alpha: " + alphapart.toString());
        System.out.println("Output in Numeric: " + numericpart.toString());
    }
}
