package Practice_For_Interview;

import java.util.Scanner;

public class String_Reverse_1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String:");

        String input = scanner.nextLine();
        char ch;

        String nStr = "";
        for (int i=0; i<input.length(); i++){
            ch = input.charAt(i);
            nStr = ch + nStr;
        }
        System.out.println("Reverse String is: " + nStr);
    }
}
