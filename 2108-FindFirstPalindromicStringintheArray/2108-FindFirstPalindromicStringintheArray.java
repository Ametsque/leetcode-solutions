// Last updated: 29/04/2025, 19:05:49
class Solution {
    public String firstPalindrome(String[] words) {
        String palindromicString = "";
        for (String word : words){
            if(checkPalindromicWord(word)){
                palindromicString = word;
                break;
            }
        }
        return palindromicString;
    }

    public boolean checkPalindromicWord(String word){
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) != word.charAt(word.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}