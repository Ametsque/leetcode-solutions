// Last updated: 29/04/2025, 18:42:14
class Solution {
    public String reformat(String s) {
        ArrayList<Character> alphabetList = new ArrayList<>();
        ArrayList<Character> digitList = new ArrayList<>();

        for (char sChar : s.toCharArray()) {
            if (sChar - '0' > 9) {
                alphabetList.add(sChar);
            } else {
                digitList.add(sChar);
            }
        }

        if (Math.abs(alphabetList.size() - digitList.size()) > 1) {
            return "";
        }

        StringBuilder sReformat = new StringBuilder();

        if (digitList.size() >= alphabetList.size()) {
            for (int i = 0; i < alphabetList.size(); i++) {
                sReformat.append(digitList.get(i));
                sReformat.append(alphabetList.get(i));
            }
            if (digitList.size() > alphabetList.size()) {
                sReformat.append(digitList.get(digitList.size()-1));
            }
        } else {
            for (int i = 0; i < digitList.size(); i++) {
                sReformat.append(alphabetList.get(i));
                sReformat.append(digitList.get(i));
            }
            sReformat.append(alphabetList.get(alphabetList.size()-1));
        }

        return sReformat.toString();
    }
}