// Last updated: 29/04/2025, 18:43:50
class Solution {
    public int[] runningSum(int[] nums) {
        int sum[] = new int [nums.length];

        if (nums.length == 0){
            return sum;
        }
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            sum[i] = sum[i-1] + nums[i];
        }
        return sum;
    }
}