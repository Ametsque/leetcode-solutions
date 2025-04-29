// Last updated: 29/04/2025, 18:44:56
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            if (i == mat.length-1-i) {
                sum += mat[i][i];
                continue;
            }
            sum += mat[i][i];
            sum += mat[i][mat.length-i-1];
        }

        return sum;
    }
}