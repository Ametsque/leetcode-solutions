// Last updated: 29/04/2025, 18:40:16
class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedHeights = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            sortedHeights[i] = heights[i];
        }

        Arrays.sort(sortedHeights);
        int unexpectedCount = 0;

        for(int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i]) {
                unexpectedCount++;
            }
        }

        return unexpectedCount;
    }
}