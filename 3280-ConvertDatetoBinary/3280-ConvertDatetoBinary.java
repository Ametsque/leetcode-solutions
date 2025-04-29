// Last updated: 29/04/2025, 20:00:13
class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder numberString = new StringBuilder();
        StringBuilder bitString = new StringBuilder();

        for (char dateChar: date.toCharArray()) {
            if (dateChar != '-') {
                numberString.append(dateChar);
            } else {
                bitString.append(Integer.toBinaryString(Integer.parseInt(numberString.toString())));
                bitString.append('-');
                numberString.setLength(0);
            }
        }

        bitString.append(Integer.toBinaryString(Integer.parseInt(numberString.toString())));

        return bitString.toString();
    }
}