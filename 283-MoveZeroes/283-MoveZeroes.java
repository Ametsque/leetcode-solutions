// Last updated: 29/04/2025, 14:38:05
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex;
        for (zeroIndex = 0; zeroIndex < nums.length; zeroIndex++){
            if (nums[zeroIndex] == 0){
                break;
            }
        }

        if (zeroIndex == nums.length-1){
            return;
        }

        for (int i = zeroIndex+1; i < nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[zeroIndex];
                nums[zeroIndex] = nums[i];
                nums[i] = temp;
                zeroIndex++;
            }
        }
        return; 
    }
}