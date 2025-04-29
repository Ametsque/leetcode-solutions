// Last updated: 29/04/2025, 19:56:13
class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int longestCount = 0;
        int count = 0;
        boolean oddNum = false;

        for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                    if (!oddNum) {
                        if (count > longestCount) {
                            longestCount = count;
                        }
                        count = 1;
                    } else {
                        count++;
                        oddNum = false; 
                    }
                } else if(nums[i] <= threshold && count != 0) {
                    if (oddNum) {
                        if (count > longestCount) {
                            longestCount = count;
                        }
                        count = 0;
                    } else {
                        oddNum = true;
                        count++;
                    }
                } else {
                    if (count > longestCount) {
                        longestCount = count;
                    }
                    count = 0;
                }
        }

        if (count != 0 && longestCount < count) {
            return count;
        }

        return longestCount;
    }
}