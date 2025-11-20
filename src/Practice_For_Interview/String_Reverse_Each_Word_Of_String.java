package Practice_For_Interview;

public class String_Reverse_Each_Word_Of_String {
    public static void main(String[]args){
        reverseEachWordOfString("Java is good programming languages");
    }

    static void reverseEachWordOfString(String inputString) {
        String[] words = inputString.split(" ");

        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String nstr = "";
            char ch;
            for (int j = 0; j < word.length(); j++) {
                ch = word.charAt(j);
                nstr = ch + nstr;
            }
            reverseString = reverseString + nstr + " ";
        }

        System.out.println(inputString);
        System.out.println(reverseString);
    }
}