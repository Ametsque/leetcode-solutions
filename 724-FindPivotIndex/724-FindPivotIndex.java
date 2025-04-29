// Last updated: 29/04/2025, 14:56:35
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;

        for (int num : nums) {
            total+= num;
        }

        int leftTotal = 0;
        int leftIndex = 0;

        for (int num : nums) {
            total -= num;
            if (total == leftTotal) {
                return leftIndex;
            }
            leftTotal += num;
            leftIndex++;
        }
        return -1;
    }
}