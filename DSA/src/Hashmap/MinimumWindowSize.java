package Hashmap;

public class MinimumWindowSize {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        int result = minWindow(s, t);
        System.out.println("The minimum window length is: " + (result == Integer.MAX_VALUE ? 0 : result));
    }

    public static int minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return Integer.MAX_VALUE;
        }

        // Frequency map for characters in target string t
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int count = t.length(); // Number of characters still needed

        while (right < s.length()) {
            char rChar = s.charAt(right);
            
            // If the current character is needed, decrease count
            if (map[rChar] > 0) {
                count--;
            }
            // Decrease frequency in map (can go negative for extra chars)
            map[rChar]--;
            right++;

            // When all characters are found (a valid window)
            while (count == 0) {
                // Update minimum length
                minLen = Math.min(minLen, right - left);

                char lChar = s.charAt(left);
                map[lChar]++;
                
                // If the character released was part of string t, increase count
                if (map[lChar] > 0) {
                    count++;
                }
                left++;
            }
        }

        return minLen;
    }
}