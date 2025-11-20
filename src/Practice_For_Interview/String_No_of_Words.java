package Practice_For_Interview;
import java.util.Scanner;

public class String_No_of_Words {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");

    String str = scanner.nextLine();
    int count =1;
    for (int i=0; i<str.length(); i++){
        if((str.charAt(i) ==' ') && (str.charAt(i+1)!=' ')){
            count++;
        }
    }
    System.out.println("Number of words in string: " +count);
  }
}
