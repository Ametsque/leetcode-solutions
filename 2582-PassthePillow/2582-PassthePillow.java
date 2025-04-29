// Last updated: 29/04/2025, 19:36:14
class Solution {
    public int passThePillow(int n, int time) {
        int passes = time/(n-1);
        return passes % 2 == 0 ? (time % (n-1) + 1) : (n - time %(n-1));
    }
}