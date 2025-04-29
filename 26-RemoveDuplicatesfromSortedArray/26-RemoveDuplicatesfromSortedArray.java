// Last updated: 29/04/2025, 13:36:29
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int repeatingNumIndex = 0;
        int count = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[repeatingNumIndex]){
                continue;
            } else {
                repeatingNumIndex = i;
                nums[index] = nums[i];
                index++;
                count++;
            }
        }
        return count;
    }
}