// Last updated: 29/04/2025, 19:39:54
class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for (String detail : details) {
            if (Integer.parseInt(detail.substring(11, 13)) > 60) {
                count++;
            }
        }

        return count;
    }
}