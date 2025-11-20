package Practice_For_Interview;

public class Palindrome_1 {
    public static void main(String[]args) {
        String Str = "madam";
        System.out.println(isPalindrome(Str));
    }

    static boolean isPalindrome(String string){
        int start = 0;
        int end = string.length() -1;

        while(start < end){
            if (string.charAt(start)!= string.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
