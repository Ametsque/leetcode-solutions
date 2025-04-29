// Last updated: 29/04/2025, 14:49:47
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int subseqLength = 1;
        int maxSubSeq = 1;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]) {
                subseqLength++;
            } else {
                subseqLength = 1;
            }

            if (subseqLength > maxSubSeq) {
                maxSubSeq = subseqLength;
            }
        }

        return maxSubSeq;
    }
}