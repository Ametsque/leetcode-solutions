// Last updated: 29/04/2025, 19:57:51
class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i+=2) {
            arr[i] = nums[i+1];
            arr[i+1] = nums[i];
        }

        return arr;
    }
}