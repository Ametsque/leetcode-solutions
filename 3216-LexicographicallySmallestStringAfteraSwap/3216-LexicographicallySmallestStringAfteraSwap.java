// Last updated: 29/04/2025, 20:00:03
class Solution {
    public String getSmallestString(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        for (int i = 0; i < s.length()-1; i++) {
            int num1 = Character.getNumericValue(s.charAt(i));
            int num2 = Character.getNumericValue(s.charAt(i+1));
            if (num1 % 2 == num2 % 2) {
                if (num1 > num2) {
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, s.charAt(i+1));
                    sb.setCharAt(i+1, s.charAt(i));
                    break;
                }
            } 
        }
        return sb.toString();
    }
}