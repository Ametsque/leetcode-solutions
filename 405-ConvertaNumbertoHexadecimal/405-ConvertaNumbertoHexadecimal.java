// Last updated: 29/04/2025, 14:42:37
class Solution {
    public String toHex(int num) {
        char[] hexSet = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (num != 0) {
            result.append(hexSet[(num & 15)]);
            num = num >>> 4;
        }

        return result.reverse().toString();
    }
}