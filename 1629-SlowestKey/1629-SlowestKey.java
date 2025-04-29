// Last updated: 29/04/2025, 18:46:42
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int largestReleaseTime = releaseTimes[0];
        char longestKeyPress = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++) {
            if (releaseTimes[i] - releaseTimes[i-1] > largestReleaseTime) {
                largestReleaseTime = releaseTimes[i] - releaseTimes[i-1];
                longestKeyPress = keysPressed.charAt(i);
            } else if (releaseTimes[i] - releaseTimes[i-1] == largestReleaseTime) {
                if (keysPressed.charAt(i) > longestKeyPress) {
                    longestKeyPress = keysPressed.charAt(i);
                }
            }
        }

        return longestKeyPress;
    }
}