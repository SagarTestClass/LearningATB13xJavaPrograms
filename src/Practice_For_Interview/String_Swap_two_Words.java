package Practice_For_Interview;

import java.util.Scanner;

public class String_Swap_two_Words {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter Second String: ");
        String str2 = scanner.nextLine();

        System.out.println("Before swapping: str1=" + str1 + ",str2=" + str2);

        str1= str1 + str2; // Swapping without using 3rd variable

        str2 = str1.substring(0,str1.length() - str2.length()); //Extract initial part(Original str1) from the concatenated string

        str1 = str1.substring(str2.length()); //Extract initial part(Original str2) from the concatenated string

        System.out.println("After swapping: str1 =" + str1 + ",str2 = "+str2);
    }
}
