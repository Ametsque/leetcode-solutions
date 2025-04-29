// Last updated: 29/04/2025, 14:57:17
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double avg = 0;
        int frontPointer = 0;

        for (int i = 0; i < nums.length; i++){
            avg += nums[i];
            if (i >= k-1){
                if (avg/k > maxAvg){
                    maxAvg = avg/k;
                }
                avg -= nums[frontPointer];
                frontPointer++;
            }
        }
        return maxAvg;
    }
}