// Last updated: 29/04/2025, 14:34:23
class Solution {
    public boolean isPowerOfTwo(int n) {
        double logarithm = (Math.log10(n)/Math.log10(2));
        if (logarithm == (int) logarithm) {
            return true;
        } else {
            return false;
        }
    }
}