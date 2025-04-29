// Last updated: 29/04/2025, 19:35:22
class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int rear = nums.length - 1;
        int front = 0;
        
        while (front < rear) {
            if (nums[front] > 0) {
                break;
            }
            if (Math.abs(nums[front])==nums[rear]) {
                return nums[rear];
            } else if (Math.abs(nums[front]) < nums[rear]){
                rear--;
            } else {
               front++; 
            }
        }
        return -1;
    }
}