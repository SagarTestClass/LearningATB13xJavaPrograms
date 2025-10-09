package Practice_For_Interview;

public class Palindrome {
    public static void main(String[]args){
        String Str = "madam";
        String Reverse_Str = new StringBuilder(Str).reverse().toString();
        System.out.println(Str.equals(Reverse_Str));
    }
}
