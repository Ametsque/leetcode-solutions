// Last updated: 29/04/2025, 18:51:27
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        switch (ruleKey.charAt(0)) {
            case 't':
                index = 0;
                break;
            case 'c':
                index = 1;
                break;
            case 'n':
                index = 2;
                break;
        }

        int count = 0;

        for (List<String> item: items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}