// Last updated: 29/04/2025, 13:29:49
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int[] twoSum = new int[2];

        for (int i = 0; i < nums.length; i++){
            if (numMap.containsKey(target - nums[i])) {
                twoSum[1] = i;
                twoSum[0] = numMap.get(target - nums[i]);
                return twoSum;
            }
            numMap.put(nums[i], i);
        }

        return new int[] {0,1};
    }
}