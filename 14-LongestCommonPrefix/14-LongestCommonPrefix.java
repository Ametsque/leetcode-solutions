// Last updated: 29/04/2025, 13:31:13
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String initialString = strs[0];
        for (String str : strs){
            while (str.length() < initialString.length() || !initialString.equals(str.substring(0, initialString.length()))){
                initialString = initialString.substring(0, initialString.length() - 1);
            }
        }
        return initialString;
    }
}