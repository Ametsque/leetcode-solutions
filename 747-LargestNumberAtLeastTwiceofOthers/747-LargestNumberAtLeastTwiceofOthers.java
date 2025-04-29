// Last updated: 29/04/2025, 14:56:54
class Solution {
    public int dominantIndex(int[] nums) {
        int largestNum = -1;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestNum) {
                largestNum = nums[i];
                maxIndex = i;
            }
        }

        for (int num : nums) {
            if (num*2 > largestNum && num != largestNum) {
                return -1;
            }
        }

        return maxIndex;
    }
}