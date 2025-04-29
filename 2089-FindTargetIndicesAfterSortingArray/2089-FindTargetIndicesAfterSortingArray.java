// Last updated: 29/04/2025, 19:04:50
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> indexes = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indexes.add(i);
            } else if (nums[i] > target){
                return indexes;
            }
        }

        return indexes;
    }
}