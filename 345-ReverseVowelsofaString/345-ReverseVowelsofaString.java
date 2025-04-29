// Last updated: 29/04/2025, 14:40:42
class Solution {
    public String reverseVowels(String s) {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(s);

        int start = 0;
        int end = s.length()-1;

        while (start < end){
            if (isVowel(s.charAt(start)) && isVowel(s.charAt(end))){
                sBuilder.setCharAt(start, s.charAt(end));
                sBuilder.setCharAt(end, s.charAt(start));
                start++;
                end--;
            } else if (isVowel(s.charAt(start))){
                end--;
            } else {
                start++;
            }
        } 

        return sBuilder.toString();
    }

    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}