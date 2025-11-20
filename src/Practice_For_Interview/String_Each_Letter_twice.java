package Practice_For_Interview;

import java.util.Scanner;

public class String_Each_Letter_twice {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: "); //Hello
        String input = scanner.nextLine();

        String doubleString = doubleCharacters(input);
        System.out.println("Double characters: " + doubleString);
    }

    public static String  doubleCharacters(String str){
        StringBuilder doubled = new StringBuilder();
        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            doubled.append(ch).append(ch); //Append each char twice
        }
        return doubled.toString();
    }
}
