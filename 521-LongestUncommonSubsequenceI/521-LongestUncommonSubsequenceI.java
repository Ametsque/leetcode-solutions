// Last updated: 29/04/2025, 14:48:31
class Solution {
    public int findLUSlength(String a, String b) {
        StringBuilder longestString = new StringBuilder();
        if (a.length() >= b.length()) {
            longestString.append(a);
        } else {
            longestString.append(b);
            b = a;
        }
        
        int length = -1;

        for (int i = longestString.length()-1; i >= 0; i--){
            if (b.contains(longestString.toString())) {
                longestString.deleteCharAt(i);
            } else {
                length = i+1;
                break;
            }
        }
        return length;
    }
}