// Last updated: 29/04/2025, 14:48:52
class Solution {
    public boolean checkRecord(String s) {
        int lateSeq = 0;
        int absenceCount = 0;

        for (char c: s.toCharArray()) {
            if (c == 'A') {
                lateSeq = 0;
                absenceCount++;
            } else if (c == 'L') {
                lateSeq++;
            } else {
                lateSeq = 0;
            }

            if (lateSeq == 3 || absenceCount == 2) {
                return false;
            }
        }

        return true;
    }
}