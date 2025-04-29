// Last updated: 29/04/2025, 19:55:59
class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length <= 2) {
            return -1;
        }

        int leftVal = nums[0];
        int initialVal = 0;
        int count = 1;
        boolean lessFlag = false;
        boolean moreFlag = false;

        while (!lessFlag || !moreFlag) {
            if (count == nums.length) {
                leftVal = nums[++initialVal];
                moreFlag = false;
                lessFlag = false;
                count = 0;
            }
            if (nums[count] < leftVal) {
                moreFlag = true;
            } else if (nums[count] > leftVal) {
                lessFlag = true;
            }
            count++;
        }

        return leftVal;
    }
}