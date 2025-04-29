// Last updated: 29/04/2025, 14:47:12
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int palindromeLength = 0;
        for (char stringChar : s.toCharArray()){
            if (charSet.contains(stringChar)){
                charSet.remove(stringChar);
                palindromeLength += 2;
            } else {
                charSet.add(stringChar);
            }
        }
        if (!charSet.isEmpty()) {
            palindromeLength++;
        }

        return palindromeLength;
    }
}