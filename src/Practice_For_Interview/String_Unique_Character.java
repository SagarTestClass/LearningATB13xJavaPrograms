package Practice_For_Interview;

import java.util.Scanner;

public class String_Unique_Character {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        System.out.println("Unique charactor in \"" + input + "\":");
        printUniqueCharactors(input);
    }

    public static void printUniqueCharactors(String str){
        boolean[] unique = new boolean[128];
        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (!unique[ch]){
                unique[ch] = true;
                System.out.print(ch + "");
            }
        }
    }
}
