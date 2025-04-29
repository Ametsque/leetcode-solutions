// Last updated: 29/04/2025, 14:42:07
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()){
            return false;
        }
        int asciiVal = (int) 'a';

        int[] alphabet1 = new int[26];
        int[] alphabet2 = new int[26];
        for(int i = 0; i < ransomNote.length(); i++){
            alphabet1[ransomNote.charAt(i) - asciiVal]++;
        }
        for(int i = 0; i < magazine.length(); i++){
            alphabet2[magazine.charAt(i) - asciiVal]++;
        }

        for(int i = 0; i < 26; i++){
            if (alphabet2[i] < alphabet1[i]){
                return false;
            }
        }
        return true;
    }
}