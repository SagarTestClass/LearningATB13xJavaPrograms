package Practice_For_Interview;

import java.util.HashMap;
import java.util.Map;

public class String_Character_Count {
    public static void main(String[] args) {
        String input = "aabbcdde";
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : input.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println(freq);
    }
}
