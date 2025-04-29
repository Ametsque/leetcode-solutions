// Last updated: 29/04/2025, 19:37:28
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int largestNum = -1;

        for (int num : nums) {
            if (num > largestNum) {
                largestNum = num;
            }
        }
        for (int i = 0; i < k; i++) {
            sum += largestNum;
            largestNum++;
        }

        return sum;
    }
}