// Last updated: 29/04/2025, 19:22:52
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int pairCount = 0;

        int i = 0;
        int j = 0;

        while (i < players.length && j < trainers.length) {
            if (players[i] > trainers[j]) {
                j++;
            } else {
                pairCount++;
                i++;
                j++;
            }
        }
        return pairCount;
    }
}