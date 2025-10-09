package Practice_For_Interview;

import java.util.Arrays;

public class Anagram_Number {
    public static void main(String[] args) {
       // String str1 = "Listen", str2="Scilent";
        String str1 = "heart", str2="earth";
        char[]arr1 = str1.toCharArray();
        char[]arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
