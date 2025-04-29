// Last updated: 29/04/2025, 19:36:32
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxNumOfOnes = 0;
        int maxIndex = 0;

        for (int i = 0; i < mat.length; i++) {
            int currentNumOfOnes = 0;
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == 1) {
                    currentNumOfOnes++;
                }
            }
            if (currentNumOfOnes > maxNumOfOnes) {
                maxNumOfOnes = currentNumOfOnes;
                maxIndex = i;
            }
        }

        return new int[] {maxIndex, maxNumOfOnes};
    }
}