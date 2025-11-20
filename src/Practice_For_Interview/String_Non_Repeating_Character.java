package Practice_For_Interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class String_Non_Repeating_Character {
    public static void main(String[] args) {
        String input = "aabbcdde";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println("First non-repeating: " + c);
                break;
            }
        }
    }
}
