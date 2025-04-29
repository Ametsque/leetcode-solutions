// Last updated: 29/04/2025, 18:53:25
class Solution {
    public boolean isThree(int n) {
        int divisors = 2;
        for (int i = 2; i < n/2 + 1; i++) {
            if (n % i == 0) {
                divisors++;
            }
            if (divisors > 3) {
                return false;
            }
        }

        if (divisors < 3){
            return false;
        }

        return true;
    }
}