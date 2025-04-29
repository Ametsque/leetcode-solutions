// Last updated: 29/04/2025, 14:38:38
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        double logB3 = Math.log10(n) / Math.log10(3);

        return (logB3 == (int) logB3);
    }
}