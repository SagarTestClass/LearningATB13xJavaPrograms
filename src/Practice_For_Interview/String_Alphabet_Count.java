package Practice_For_Interview;

import java.util.Scanner;

public class String_Alphabet_Count {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String:"); //aabbcccdd
        String input = scanner.nextLine();

        String output = getCharacterCount(input);
        System.out.println("Output: " + output);
    }

       public static String getCharacterCount(String str) {
        StringBuilder result = new StringBuilder();
        int count=1;

        for (int i=0; i<str.length(); i++){ //If the next char is same, increase the count
            if (i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;

            } else{ //Append teh char and its count to the result
                result.append(str.charAt(i)).append(count);
                count=1; //Reset the count
            }
           }
        return result.toString();
    }
}
