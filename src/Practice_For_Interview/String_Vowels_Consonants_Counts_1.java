package Practice_For_Interview;

public class String_Vowels_Consonants_Counts_1 {
    public static void main(String[] args) {
        String str = "Hello World";
        VowelConsonantCount(str);
    }

    static void VowelConsonantCount(String str) {
        int vowel = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowel++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels:" + vowel);
        System.out.println("Consonenats:" + consonants);
    }
}
