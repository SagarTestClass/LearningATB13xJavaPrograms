package Practice_For_Interview;

import java.util.Scanner;

public class String_Remove_Space {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String with Space: "); //Welcome to java World
        String input = scanner.nextLine();

        String stringWithoutSpaces = removeSpaces(input);
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }

    public static String  removeSpaces(String str){
        StringBuilder result = new StringBuilder();
        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (str.charAt(i) != ' '){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
