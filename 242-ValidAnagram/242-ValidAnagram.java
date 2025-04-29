// Last updated: 29/04/2025, 14:35:22
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] stringArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            stringArray[s.charAt(i) - 'a']++;
            stringArray[t.charAt(i) - 'a']--;
        }

        for (int num : stringArray) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}