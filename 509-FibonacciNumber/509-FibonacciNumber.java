// Last updated: 29/04/2025, 14:48:20
class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int prev = 0;
        int curr = 1;
        int fib = 1;
        for (int i = 0; i < n-1; i++) {
            fib = prev + curr;
            prev = curr;
            curr = fib;
        }

        return fib;
    }
}