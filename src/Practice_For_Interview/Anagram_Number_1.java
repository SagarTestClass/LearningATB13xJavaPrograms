package Practice_For_Interview;

public class Anagram_Number_1 {
    public static void main(String[] args) {
        // String str1 = "Listen", str2="Silent";
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagram(str1, str2));
    }
    static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
