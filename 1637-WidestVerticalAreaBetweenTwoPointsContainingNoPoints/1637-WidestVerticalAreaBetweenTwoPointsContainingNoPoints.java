// Last updated: 29/04/2025, 18:47:01
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] tempPoints = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            tempPoints[i] = points[i][0];
        }

        Arrays.sort(tempPoints);

        int maxWidth = 0;
        for (int i = tempPoints.length-1; i > 0; i--) {
            if (tempPoints[i] - tempPoints[i-1] > maxWidth) {
                maxWidth = tempPoints[i] - tempPoints[i-1];
            }
        }
     
        return maxWidth;
    }
}