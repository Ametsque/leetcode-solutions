// Last updated: 29/04/2025, 18:54:32
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int totalMoves = 0;

        for (int i = 0; i < seats.length; i++) {
            int movesNeeded = (seats[i] - students[i]);
            totalMoves += movesNeeded < 0 ? -movesNeeded : movesNeeded;
        }

        return totalMoves;
    }
}