// Last updated: 29/04/2025, 19:59:52
class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c < '0' || c > '9') {
                sb.append(c);
            } else {
                if (sb.length() != 0) {
                   sb.deleteCharAt(sb.length()-1);
                }
            }
        }

        return sb.toString();
    }
}