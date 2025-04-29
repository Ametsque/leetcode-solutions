// Last updated: 29/04/2025, 19:56:59
class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;

        int length = nums.length;
        for (int i = 0; i < length;i++) {
            if (length % (i+1) == 0) {
                sum += Math.pow(nums[i],2);
            }
        }

        return sum;
    }
}