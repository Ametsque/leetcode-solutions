// Last updated: 29/04/2025, 19:14:28
class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> numberMap = new HashMap<>();

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == key){
                if (numberMap.containsKey(nums[i+1])) {
                    numberMap.put(nums[i+1], numberMap.get(nums[i+1]) + 1);
                } else {
                    numberMap.put(nums[i+1], 1);
                }
            }
        }

        int maxTarget = 0;
        int maxValue = 0;
        for (Map.Entry<Integer,Integer> entries : numberMap.entrySet()) {
            if (maxValue < entries.getValue()) {
                maxValue = entries.getValue();
                maxTarget = entries.getKey();
            }
        }
        return maxTarget;
    }
}