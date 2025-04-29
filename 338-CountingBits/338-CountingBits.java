// Last updated: 29/04/2025, 14:39:15
class Solution {
    public int[] countBits(int n) {
        int[] binaryOnes = new int[n+1];
        for (int i = 0; i < n + 1; i++){
            int numOfOnes = 0;
            int binaryNum = i;
            while (binaryNum > 0){
                binaryNum = binaryNum&(binaryNum-1);
                numOfOnes++;
            }
            binaryOnes[i] = numOfOnes;
        }
        return binaryOnes;
    }
}