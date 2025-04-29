// Last updated: 29/04/2025, 19:16:32
class Solution {
    public String largestGoodInteger(String num) {
        int count = 0;
        char currentNum = num.charAt(0);
        boolean numExists = false;
        StringBuilder goodInt = new StringBuilder();
        goodInt.append("000");

        for (char c : num.toCharArray()) {
            if (currentNum == c) {
                count++;
                if (count == 3) {
                    numExists = true;
                    if (currentNum > goodInt.charAt(0)) {
                        goodInt.setLength(0);
                        for (int i = 0; i < 3; i++) {
                            goodInt.append(currentNum);
                        }
                    }
                }
            } else {
                currentNum = c;
                count = 1;
            }
        }

        if (!numExists) {
            return "";
        }
        
        return goodInt.toString();
    }
}