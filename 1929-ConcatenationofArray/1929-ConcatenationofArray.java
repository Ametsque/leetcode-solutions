// Last updated: 29/04/2025, 18:53:07
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] doubleNums = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            doubleNums[i] = nums[i];
            doubleNums[i+nums.length] = nums[i];
        }

        return doubleNums;
    }
}