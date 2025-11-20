package Practice_For_Interview;

import java.util.HashSet;

public class String_Longest_Without_Repeating_Char {
    public static void main(String[] args) {
        String S1 = "abcabcab"; //Expected: "abc", length 3
        String S2 = "bbbbb"; //Expected: "b", length 1
        String S3 = "pwwkew"; //Expected: "wke", length 3
        String S4 = ""; //Expected: "", length 0
        
        System.out.println("Longest substring without repeating charater in S1:" + lengthofLongestSubstring(S1)); //Output:3
        System.out.println("Longest substring without repeating charater in S2:" + lengthofLongestSubstring(S2)); //Output:1
        System.out.println("Longest substring without repeating charater in S3:" + lengthofLongestSubstring(S3)); //Output:3
        System.out.println("Longest substring without repeating charater in S4:" + lengthofLongestSubstring(S4)); //Output:0
    }
    public static int lengthofLongestSubstring(String s){
        HashSet <Character> set = new HashSet<>();
        int maxlength = 0;
        int start = 0;
        int end = 0;

        while(end < s.length()){
            char currentChar = s.charAt(end);
            if (!set.contains(currentChar)){
                set.add(currentChar);
                maxlength = Math.max(maxlength, end - start + 1);
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxlength;
    }
}
