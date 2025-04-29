// Last updated: 29/04/2025, 18:49:56
class Solution {
    public int totalMoney(int n) {
        int start = 1;
        int current = 1;
        int total = 1;

        for (int i = 1; i < n; i++) {
            if (i % 7 == 0) {
                start++;
                current = start-1;
            }
            current++;
            total+= current;
        }

        return total;
    }
}