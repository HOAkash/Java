import java.util.HashMap;
import java.util.Map;

public class sub {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int windowStart = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);
            if (charIndexMap.containsKey(rightChar)) {
                windowStart = Math.max(windowStart, charIndexMap.get(rightChar) + 1);
            }
            charIndexMap.put(rightChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Length of the longest substring: " + lengthOfLongestSubstring(str));
    }
}
