class Solution {
    public boolean isAnagram(String s, String t) {

        // Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency array for a–z (default values = 0)
        int[] freq = new int[26];

        // Count characters in s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Subtract characters using t
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;

            // If negative, extra character found
            if (freq[c - 'a'] < 0) {
                return false;
            }
        }

        // All characters balanced
        return true;
    }
}
