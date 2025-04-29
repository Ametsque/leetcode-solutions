// Last updated: 29/04/2025, 19:16:01
class Solution {
    public int minBitFlips(int start, int goal) {
        int bitflips = Integer.bitCount(start^goal);
        return bitflips;
    }
}