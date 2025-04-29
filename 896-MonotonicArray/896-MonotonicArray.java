// Last updated: 29/04/2025, 18:36:28
class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 2){
            return true;
        }
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]) {
                decreasing = false;
            } else if (nums[i] > nums[i+1]){
                increasing = false;
            }
        }

        return decreasing || increasing;
    }
}