// Last updated: 29/04/2025, 18:50:55
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        if (word1.length() < word2.length()) {
            for (int i = 0; i < word1.length(); i++){
                mergedString.append(word1.charAt(i));
                mergedString.append(word2.charAt(i));
            }
            mergedString.append(word2.substring(word1.length(), word2.length()));
        } else {
            for (int i = 0; i < word2.length(); i++){
                mergedString.append(word1.charAt(i));
                mergedString.append(word2.charAt(i));
            }
            mergedString.append(word1.substring(word2.length(), word1.length()));
        }
        return mergedString.toString();
    }
}