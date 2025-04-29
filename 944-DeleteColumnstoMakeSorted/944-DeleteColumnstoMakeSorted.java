// Last updated: 29/04/2025, 18:36:52
class Solution {
    public int minDeletionSize(String[] strs) {
        int columnAmount = 0;

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j-1].charAt(i) > strs[j].charAt(i)) {
                    columnAmount++;
                    break;
                }
            }
        }

        return columnAmount;
    }
}