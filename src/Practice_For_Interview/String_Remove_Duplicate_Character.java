package Practice_For_Interview;

import java.util.HashSet;
import java.util.Set;

public class String_Remove_Duplicate_Character {
    public static void main(String[] args) {
        String input = "aabbcdde";
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        System.out.println("After removing duplicates: " + result.toString());
    }
}