// Last updated: 29/04/2025, 19:55:45
class Solution {
    public boolean isFascinating(int n) {
        StringBuilder nModification = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            nModification.append(n*i);
        }
        int[] numArray = new int[9];

        if (nModification.length() > 9) {
            return false;
        }

        for (char c: nModification.toString().toCharArray()) {
            int value = Character.getNumericValue(c);
            if (value == 0) {
                return false;
            } else if (numArray[value-1] != 1) {
                numArray[value-1]++;
            } else {
                return false;
            }
        }
        return true;
    }
}