// Last updated: 29/04/2025, 19:06:27
class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder dividedString = new StringBuilder();
        String[] dividedArray = new String[(int) Math.ceil((double) s.length() / k)];
        int arrayIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            dividedString.append(s.charAt(i));
            if ((i+1) % k == 0) {
                dividedArray[arrayIndex] = dividedString.toString();
                arrayIndex++;
                dividedString.setLength(0);
            }
        }

        if (s.length() % k != 0) {
            for (int i = 0; i < k - s.length() % k; i++){
                dividedString.append(fill);
            }
            dividedArray[arrayIndex] = dividedString.toString();
        }

        return dividedArray;
    }
}