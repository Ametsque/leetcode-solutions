// Last updated: 29/04/2025, 13:37:23
class Solution {
    public int[] plusOne(int[] digits) {
        int currentPointer = digits.length-1;
        ArrayList<Integer> digitList = new ArrayList<>();

        digits[currentPointer]++;
        while (digits[currentPointer] == 10 && currentPointer > 0) {
            digits[currentPointer] = 0;
            currentPointer--;
            digits[currentPointer]++;
        }

        if (digits[0] == 10) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
            digits[1] = 0;
        }
        return digits;
    }
}