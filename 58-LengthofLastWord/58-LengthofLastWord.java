// Last updated: 29/04/2025, 13:36:59
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length()-1; i >= 0; i--){
            if (!(String.valueOf(s.charAt(i)).equals(" "))){
                length++;
            } else if(length > 0){
                return length;
            }
        }
        return length;
    }
}