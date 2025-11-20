package Practice_For_Interview;

import java.util.HashMap;

public class String_Duplicate_Character_Count {
    public static void main(String[] args) {

        CharacterCount("Test Automation Java Automation");
    }
    static void CharacterCount(String inputString) {

        HashMap<String, Integer> charCountMap = new HashMap<>();
        for (String S : inputString.split(" ")) {
            if (charCountMap.containsKey(S)) {
                charCountMap.put(S, charCountMap.get(S) + 1);
            } else {
                charCountMap.put(S, 1);
            }
        }

        System.out.println("Count of Characters in given String : " + charCountMap);
            }
        }
