// Last updated: 29/04/2025, 19:16:49
class Solution {
    public boolean digitCount(String num) {
        int[] frequency = new int[10];
        for (char c: num.toCharArray()) {
            frequency[c - '0']++;
        }

        for (int i = 0; i < num.length(); i++) {
            if (frequency[i] != Character.getNumericValue(num.charAt(i))){
                return false;
            }
        }

        return true;
    }
}