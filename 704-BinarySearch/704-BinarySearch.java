// Last updated: 29/04/2025, 14:50:28
class Solution {
    public int search(int[] nums, int target) {
        int lb = 0;
        int ub = nums.length-1;
        int mid;

        do {
            mid = lb + ((ub - lb) / 2);
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }

        } while (lb <= ub);

        return -1;
    }
}