// Last updated: 29/04/2025, 19:35:37
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        HashSet<Double> avgSet = new HashSet<>();

        while (left < right) {
            avgSet.add((nums[left]+nums[right])/2.0);
            left++;
            right--;
        }

        return avgSet.size();
    }
}